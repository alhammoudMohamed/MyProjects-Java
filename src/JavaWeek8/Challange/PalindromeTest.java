package JavaWeek8.Challange;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindrome(String name) {
        Palindrome palindrome = new Palindrome();
         String expected = palindrome.isPalindrome("babab");
        Assertions.assertEquals(expected,"babab");
    }
}