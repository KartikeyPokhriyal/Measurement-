import java.util.Objects;

public class Unit {
   private static final double FEET_TO_INCHES = 12;
   private double base_unit;

    public Unit (double base_unit) {

        this.base_unit = base_unit;
    }


    public static Unit feet(double value) {
        return new Unit(value * FEET_TO_INCHES);

    }

    public static Unit inch(double value) {
        return new Unit(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Unit)) return false;
        Unit unit = (Unit) o;
        return Double.compare(unit.base_unit, base_unit) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(base_unit);
    }
}
