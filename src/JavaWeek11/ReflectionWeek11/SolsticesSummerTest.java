package JavaWeek11.ReflectionWeek11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SolsticesSummerTest {
    Solstices solstices = new Solstices();

    @Test
    void getSummerSolsticeCountdown() {

        String actual = solstices.getSummerSolsticeCountdown(LocalDate.now());
        String expected = "The Summer Solstice 2019 is on FRIDAY, JUNE 21, 2019 (in 144 days)";
        Assertions.assertEquals(expected, actual);
    }

}