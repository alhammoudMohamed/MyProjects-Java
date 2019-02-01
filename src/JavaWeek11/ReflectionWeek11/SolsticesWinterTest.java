package JavaWeek11.ReflectionWeek11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class SolsticesWinterTest {
    Solstices solstices = new Solstices();

    @Test
    void getWinterSolsticeCountdown() {

        String actual = solstices.getWinterSolsticeCountdown(LocalDate.now());
        String expected = "The Winter Solstice 2019 is on SUNDAY, DECEMBER 22, 2019 (in 328 days)";
        Assertions.assertEquals(expected, actual);


    }


}