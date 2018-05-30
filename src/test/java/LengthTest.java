import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LengthTest {

    @Test
   public void checkIfFeetAndInchAreEqual() {
        Length oneFeet = Length.feet(1);
        Length twelveInch = Length.inch(12);

        assertEquals(oneFeet, twelveInch);
    }

    @Test
    public void checkIfCentimeterAndInchAreEqual() {
        Length twoCentimeter = Length.centimeter(2);
        Length pointEightInch = Length.inch(0.8);

        assertEquals(twoCentimeter, pointEightInch);
    }
}
