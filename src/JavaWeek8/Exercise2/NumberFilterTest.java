package JavaWeek8.Exercise2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;
class NumberFilterTest {
NumberFilter numberFilter = new NumberFilter();
    @Test
    void testIsEven() {
        List<Integer> numbers= Arrays.asList(3,2,4,5,6,7,8,9);
        Predicate<Integer> getEven = number -> (number % 2 == 0);
        List<Integer>filtered = numberFilter.filter(numbers,getEven);
        List<Integer>expected = Arrays.asList(2,4,6,8);
        Assertions.assertEquals(expected,filtered);
    }
    @Test
    void testIsOdd(){
        List<Integer>numbers = Arrays.asList(2,3,5,6,7,8);
        Predicate<Integer> getOdd = number -> (number % 2 != 0);
        List<Integer> filtered = numberFilter.filter(numbers,getOdd);
        List<Integer>expexted = Arrays.asList(3,5,7);
        Assertions.assertEquals(expexted,filtered);
    }
}