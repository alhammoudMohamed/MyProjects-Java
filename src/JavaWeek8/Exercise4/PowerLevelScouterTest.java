package JavaWeek8.Exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PowerLevelScouterTest {
    PowerLevelScouter powerLevelScouter = new PowerLevelScouter();

    @Test
    void TestScout() {
        Integer name = 619;
        Assertions.assertEquals(name, powerLevelScouter.scout("Susana"));

    }

    @Test
    void TestSpecialScout() {
        Integer name = 651;
        Assertions.assertEquals(name, powerLevelScouter.scoutEnhanced("Susana"));
    }
}