import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class MeasurementTest {

    @Test
    public void checkIfFeetAndInchAreEqual() {
        AddableMeasurements oneFeet = AddableMeasurements.feet(1);
        AddableMeasurements twelveInch = AddableMeasurements.inch(12);

        assertEquals(oneFeet, twelveInch);
    }

    @Test
    public void checkIfCentimeterAndInchAreEqual() {
        AddableMeasurements twoCentimeter = AddableMeasurements.centimeter(2);
        AddableMeasurements pointEightInch = AddableMeasurements.inch(0.8);

        assertEquals(twoCentimeter, pointEightInch);
    }

    @Test
    public void checkIfGallonAndLitreAreEqual() {
        AddableMeasurements oneGallon = AddableMeasurements.gallon(1);
        AddableMeasurements pointThreeSevenLitre = AddableMeasurements.litre(3.785);

        assertEquals(oneGallon, pointThreeSevenLitre);
    }

    @Test
    public void checkIfThreeGallonAndLitreAreEqual() {
        AddableMeasurements threeGallon = AddableMeasurements.gallon(3);
        AddableMeasurements elevenPointThreeLitre = AddableMeasurements.litre(11.355);

        assertEquals(threeGallon, elevenPointThreeLitre);
    }

    @Test
    public void shouldNotCompareFeetAndGallon() {
        AddableMeasurements threeGallon = AddableMeasurements.gallon(3);
        AddableMeasurements twoFeet = AddableMeasurements.feet(2);

        assertNotEquals(threeGallon, twoFeet);
    }

    @Test
    public void shouldAddOneInchToTwoInchToGiveThreeInches() {
        AddableMeasurements oneInch = AddableMeasurements.inch(1);
        AddableMeasurements twoInch = AddableMeasurements.inch(2);
        AddableMeasurements threeInch = AddableMeasurements.inch(3);

        assertEquals(threeInch, oneInch.add(twoInch));
    }

    @Test
    public void shouldAddThreeInchToFiveInchToGiveEightInches() {
        AddableMeasurements threeInch = AddableMeasurements.inch(3);
        AddableMeasurements fiveInch = AddableMeasurements.inch(5);
        AddableMeasurements eightInch = AddableMeasurements.inch(8);

        assertEquals(eightInch, threeInch.add(fiveInch));
    }

    @Test
    public void shouldAddThreeInchToFiveFeetToGiveEightInches() {
        AddableMeasurements threeInch = AddableMeasurements.inch(3);
        AddableMeasurements fiveFeet = AddableMeasurements.feet(5);
        AddableMeasurements sixtyThreeInch = AddableMeasurements.inch(63);

        assertEquals(sixtyThreeInch, threeInch.add(fiveFeet));
    }

    @Test (expected = MeasurementTypeIncompatibleException.class)
    public void shouldThrowExceptionIfLengthAndVolumeAreAdded() {
        AddableMeasurements threeInch = AddableMeasurements.inch(3);
        AddableMeasurements fiveGallon = AddableMeasurements.gallon(5);

        threeInch.add(fiveGallon);
    }

    @Test
    public void shouldCompareFarenhietAndCelcius() {
        Measurement oneCelcius = Measurement.c(40);
        Measurement thirtyThreePointEight = Measurement.f(104);

        assertEquals(oneCelcius, thirtyThreePointEight);
    }
}
