package JavaWeek8.Exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class KeywordFinder {
    public List<String> filter(String sentence, Predicate<String> condition) {
        List<String> filteredWords = new ArrayList<>();
         String[] splitted = sentence.split(" ");
        for (String word : splitted) {
            if (condition.test(word)) {
                filteredWords.add(word);

            }
        }
        return filteredWords;


    }
}
