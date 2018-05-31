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

    @Test
    public void shouldAddOneInchToTwoInchToGiveThreeInches() {
        Measurement oneInch = Measurement.inch(1);
        Measurement twoInch = Measurement.inch(2);
        Measurement threeInch = Measurement.inch(3);

        assertEquals(threeInch, oneInch.add(twoInch));
    }

    @Test
    public void shouldAddThreeInchToFiveInchToGiveEightInches() {
        Measurement threeInch = Measurement.inch(3);
        Measurement fiveInch = Measurement.inch(5);
        Measurement eightInch = Measurement.inch(8);

        assertEquals(eightInch, threeInch.add(fiveInch));
    }

    @Test
    public void shouldAddThreeInchToFiveFeetToGiveEightInches() {
        Measurement threeInch = Measurement.inch(3);
        Measurement fiveFeet = Measurement.feet(5);
        Measurement sixtyThreeInch = Measurement.inch(63);

        assertEquals(sixtyThreeInch, threeInch.add(fiveFeet));
    }

    @Test (expected = MeasurementTypeIncompatibleException.class)
    public void shouldThrowExceptionIfLengthAndVolumeAreAdded() {
        Measurement threeInch = Measurement.inch(3);
        Measurement fiveGallon = Measurement.gallon(5);

        threeInch.add(fiveGallon);
    }
}
