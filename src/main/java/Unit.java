import java.util.Objects;

public class Unit {
   private static final double FEET_TO_INCHES = 12;
   private static final double CENTIMETER_TO_INCHES = 0.4;
   private static final double GALLON_TO_LITRES= 3.785;
   private static final double F_TO_C= (double) 5/9;
   private final Type type;

    private double conversion_factor;
    private double anotherFactor;


    public Unit( double conversion_factor, Type type, double anotherFactor) {
        this.type = type;
        this.conversion_factor = conversion_factor;
        this.anotherFactor = anotherFactor;
    }

    public static Unit feet() {
        return new Unit(FEET_TO_INCHES, Type.LENGTH, 0);
    }

    public static Unit inch() {
        return new Unit(1, Type.LENGTH, 0);
    }

    public static Unit centimeter() {
        return new Unit(CENTIMETER_TO_INCHES, Type.LENGTH, 0);
    }

    public static Unit gallon() {
        return new Unit(GALLON_TO_LITRES, Type.VOLUME,0);
    }

    public static Unit litre() {
        return new Unit(1 ,Type.VOLUME,0);
    }

    public static Unit f() {
        return new Unit(F_TO_C, Type.TEMPERATURE, 32);
    }

    public static Unit c() {
        return new Unit(1, Type.TEMPERATURE, 0);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Unit)) return false;
        Unit unit = (Unit) o;
        return Double.compare(unit.conversion_factor, conversion_factor) == 0 &&
                type == unit.type;
    }

    @Override
    public int hashCode() {

        return Objects.hash(type, conversion_factor);
    }

    @Override
    public String toString() {
        return "Unit{" +
                "type=" + type +
                ", conversion_factor=" + conversion_factor +
                ", anotherFactor=" + anotherFactor +
                '}';
    }

    public double convertToBase(double value) {
        return (value - anotherFactor) * conversion_factor;
    }

    public boolean isCompatible(Unit unit) {
        return (unit.type == type);
    }

    public boolean isType(Type length) {
        return this.type == type;
    }
}
