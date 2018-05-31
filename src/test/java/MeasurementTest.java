import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class MeasurementTest {

    @Test
   public void checkIfFeetAndInchAreEqual() {
        Measurement oneFeet = Measurement.feet(1);
        Measurement twelveInch = Measurement.inch(12);

        assertEquals(oneFeet, twelveInch);
    }

    @Test
    public void checkIfCentimeterAndInchAreEqual() {
        Measurement twoCentimeter = Measurement.centimeter(2);
        Measurement pointEightInch = Measurement.inch(0.8);

        assertEquals(twoCentimeter, pointEightInch);
    }
    @Test
    public void checkIfGallonAndLitreAreEqual() {
        Measurement oneGallon = Measurement.gallon(1);
        Measurement pointThreeSevenLitre = Measurement.litre(3.785);

        assertEquals(oneGallon, pointThreeSevenLitre);
    }

    @Test
    public void checkIfThreeGallonAndLitreAreEqual() {
        Measurement threeGallon = Measurement.gallon(3);
        Measurement elevenPointThreeLitre = Measurement.litre(11.355);

        assertEquals(threeGallon, elevenPointThreeLitre);
    }

    @Test
    public void shouldNotCompareFeetAndGallon() {
        Measurement threeGallon = Measurement.gallon(3);
        Measurement twoFeet = Measurement.feet(2);

        assertNotEquals(threeGallon, twoFeet);
    }
}
