package JavaWeek7.Exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class BiggesAndSmallestTest {
    NumberJudge numberJudge = new NumberJudge();


    @Test
    void testNoNumber() {
        List<Integer> numbers = new ArrayList<>();
        Assertions.assertEquals(Optional.empty(), numberJudge.getBiggest(numbers));

    }
        @Test
        void testNumber () {
            List<Integer> numbers = Arrays.asList(23, 56, 87, 98, 5);
            Assertions.assertEquals(Optional.of(98), numberJudge.getBiggest(numbers));
        }
    }



