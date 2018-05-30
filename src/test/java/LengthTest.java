import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LengthTest {

    @Test
   public void checkIfFeetAndInchAreEqual() {
        Length oneFeet = Length.feet(1);
        Length twelveInch = Length.inch(12);

        assertEquals(oneFeet, twelveInch);
    }
}
