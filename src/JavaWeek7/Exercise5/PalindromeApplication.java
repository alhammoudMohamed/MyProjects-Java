package JavaWeek7.Exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeApplication {
    public static void main(String[] args) {

        List<String >words = Arrays.asList("madam", "nurses run","hello");
        Palindromejudge palindromejudge = new Palindromejudge();
        for (String word : words) {
            if (palindromejudge.isPalindrome(word)){
                System.out.println("The word  : " + word + " is a  palindrom");

            }
            else System.out.println("The word : " + word + " is not a palindrom");

        }
    }
}
