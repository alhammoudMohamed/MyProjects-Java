package JavaWeek7.Exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeApplicationTest {
    Palindromejudge palindromejudge = new Palindromejudge();
    @Test
    void testWord() {

        Assertions.assertTrue(palindromejudge.isPalindrome("mad am"));
    }
}

