package JavaWeek10.Exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SmsComparatorTest {

SmsComparator comparator = new SmsComparator();
    @Test
    void getHamToSpamRatio() {
    String expected ="ham 86 % spam 13 %";
    String actual = comparator.getHamToSpamRatio();
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void getMostAppearingWordInHam() {

    }

    @Test
    void getMostUsedHamLetter() {
    }

    @Test
    void getLongestSpamMessage() {
    }
}