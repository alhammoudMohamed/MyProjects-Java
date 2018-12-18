package JavaWeek7;

import JavaWeek7.Exercise1.MoneyCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoneyCalculatorTest {
    MoneyCalculator moneyCalculator = new MoneyCalculator();
    @Test
    void testGetAccumulatedValue(){
        List<Integer> payments = Arrays.asList(3,4,5,2,1,3,4,5,3,1);
        Integer total = moneyCalculator.calculate(payments);
        Integer expected = 31;
        Assertions.assertEquals(expected,total);
    }

}