

import java.util.Objects;

public class Measurement {
    private final double value;
    private final Unit unit;

    public Measurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Measurement feet(double value) {
         return new Measurement(value,  Unit.feet(value));
    }

    public static Measurement inch(double value) {
        return new Measurement(value, Unit.inch(value));
    }

    public static Measurement centimeter(double value) {
        return new Measurement(value, Unit.centimeter(value));
    }

    public static Measurement gallon(double value) {
        return new Measurement(value, Unit.gallon(value));
    }

    public static Measurement litre(double value) {
        return new Measurement(value, Unit.litre(value));
    }

    @Override
    public boolean equals(Object o) throws IllegalArgumentException{
        if (this == o) return true;
        if (!(o instanceof Measurement)) return false;
        Measurement measurement = (Measurement) o;
        return Objects.equals(unit, measurement.unit);
    }

    @Override
    public int hashCode() {

        return Objects.hash(unit);
    }

    @Override
    public String toString() {
        return "Measurement{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
