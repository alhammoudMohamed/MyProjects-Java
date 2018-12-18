package JavaWeek7.Exercise4;

import JavaWeek7.Exercise3.NumberJudge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SplitterApplicationTest {
    NumberJudge numberJudge = new NumberJudge();
    @Test
    void testNumber() {
        Integer number = 54783;
        List<Integer> deveidedNumber = Arrays.asList(5, 4, 7, 8, 3);
        Assertions.assertEquals(deveidedNumber, numberJudge.split(number));

    }
}

