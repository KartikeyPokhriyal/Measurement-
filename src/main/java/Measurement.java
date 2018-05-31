

import java.util.Objects;

public class Measurement {
    protected final double value;
    protected final Unit unit;

    public Measurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public  static Measurement f(double value) {
        return new Measurement(value, Unit.f());
    }

    public  static Measurement c(double value) {
        return new Measurement(value, Unit.c());

    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Measurement)) return false;
        Measurement measurement = (Measurement) o;
        return unit.isCompatible(measurement.unit) &&
                (compare(unit.convertToBase(value), measurement.unit.convertToBase(measurement.value)));
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

    public static final double EPSILON = 0.0000000001;
    public boolean compare(double a, double b) {
        return Math.abs(a-b) < EPSILON;
    }
}
