package JavaWeek9.Exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {
    Caesar caesar = new Caesar();

    @Test
    void testisNormal() {
         String actual = caesar.cihper("HELLO", 1);
         String expected = "IFMMP";
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void testContainsNonAlpabets(){
        String actual = caesar.cihper("hello, world!!$%%$#@",13);
        String expected = "uryyb, jbeyq!!$%%$#@";
        Assertions.assertEquals(expected,actual);
    }
}