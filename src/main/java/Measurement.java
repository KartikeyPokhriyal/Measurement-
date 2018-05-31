

import java.util.Objects;

public class Measurement {
    private final double value;
    private final Unit unit;

    public Measurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Measurement feet(double value) {
         return new Measurement(value,  Unit.feet());
    }

    public static Measurement inch(double value) {
        return new Measurement(value, Unit.inch());
    }

    public static Measurement centimeter(double value) {
        return new Measurement(value, Unit.centimeter());
    }

    public static Measurement gallon(double value) {
        return new Measurement(value, Unit.gallon());
    }

    public static Measurement litre(double value) {
        return new Measurement(value, Unit.litre());
    }


    public Measurement add(Measurement length) throws MeasurementTypeIncompatibleException {

        if (unit.isCompatible(length.unit)) {
            if (unit.isType(Type.LENGTH))
                return new Measurement(unit.convertToBase(value) + length.unit.convertToBase(length.value), Unit.inch());
            else
                return new Measurement(unit.convertToBase(value) + length.unit.convertToBase(length.value), Unit.litre());

        } else throw new MeasurementTypeIncompatibleException("You cannot add volume and length");
    }


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Measurement)) return false;
        Measurement measurement = (Measurement) o;
        return unit.isCompatible(measurement.unit) && Objects.equals(unit.convertToBase(value), measurement.unit.convertToBase(measurement.value));
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
