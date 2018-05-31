import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class VolumeTest {

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
    public void throwExceptionWhenFeetAndGallonAreCompared() {
        Measurement threeGallon = Measurement.gallon(3);
        Measurement twoFeet = Measurement.feet(2);

        assertNotEquals(threeGallon, twoFeet);
    }
}
