package JavaWeek8.Challange;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Palindrome {
    public String isPalindrome(String word, Predicate<String>condition){
        if(condition.test(word)){
            return word;
        }
        return word;
    }
    public String isPalindrome (String name){
         String[] splitted = name.split("");
        Collections.reverse(Arrays.asList(splitted));
        Predicate <String> words = word-> splitted.equals(name);
        return isPalindrome(name,words);

    }
}
