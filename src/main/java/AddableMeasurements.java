public class AddableMeasurements extends Measurement {

    public AddableMeasurements(double value, Unit unit) {
        super(value, unit);
    }

    public static AddableMeasurements feet(double value) {
        return new AddableMeasurements(value,  Unit.feet());
    }

    public static AddableMeasurements inch(double value) {
        return new AddableMeasurements(value, Unit.inch());
    }

    public static AddableMeasurements centimeter(double value) {
        return new AddableMeasurements(value, Unit.centimeter());
    }

    public static AddableMeasurements gallon(double value) {
        return new AddableMeasurements(value, Unit.gallon());
    }

    public static AddableMeasurements litre(double value) {
        return new AddableMeasurements(value, Unit.litre());
    }

    public Measurement add(Measurement length) throws MeasurementTypeIncompatibleException {

        if (unit.isCompatible(length.unit)) {
            if (unit.isType(Type.LENGTH))
                return new Measurement(unit.convertToBase(value) + length.unit.convertToBase(length.value), Unit.inch());
            else
                return new Measurement(unit.convertToBase(value) + length.unit.convertToBase(length.value), Unit.litre());

        } else throw new MeasurementTypeIncompatibleException("You cannot add volume and length");
    }
}
