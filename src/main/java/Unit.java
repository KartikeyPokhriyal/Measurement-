import java.util.Objects;

public class Unit {
   private static final double FEET_TO_INCHES = 12;
   private static final double CENTIMETER_TO_INCHES = 0.4;
   private static final double GALLON_TO_LITRES= 3.785;
   private final Type type;

    private double base_unit;



    public Unit (double base_unit, Type type) {
        this.base_unit = base_unit;
        this.type = type;
    }


    public static Unit feet(double value) {
        return new Unit( value * FEET_TO_INCHES, Type.LENGTH);
    }

    public static Unit inch(double value) {
        return new Unit(value, Type.LENGTH);
    }

    public static Unit centimeter(double value) {
        return new Unit(value * CENTIMETER_TO_INCHES, Type.LENGTH);
    }

    public static Unit gallon(double quantity) {
        return new Unit(quantity * GALLON_TO_LITRES, Type.VOLUME);
    }

    public static Unit litre(double quantity) {
        return new Unit(quantity, Type.VOLUME);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Unit)) return false;
        Unit unit = (Unit) o;
        if(unit.type != type) return false;
       return Double.compare(unit.base_unit, base_unit) == 0 ;
    }

    @Override
    public int hashCode() {

        return Objects.hash(type, base_unit);
    }

    @Override
    public String toString() {
        return "Unit{" +
                "type=" + type +
                ", base_unit=" + base_unit +
                '}';
    }
}
