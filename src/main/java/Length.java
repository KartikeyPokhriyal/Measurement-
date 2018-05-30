

import java.util.Objects;

public class Length {
    private final double value;
    private final Unit unit;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Length feet(double value) {
         return new Length(value,  Unit.feet(value));
    }

    public static Length inch(double value) {
        return new Length(value, Unit.inch(value));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Length)) return false;
        Length length = (Length) o;
        return Objects.equals(unit, length.unit);
    }

    @Override
    public int hashCode() {

        return Objects.hash(unit);
    }
}
