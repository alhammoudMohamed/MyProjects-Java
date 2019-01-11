package JavaWeek8.Exercise3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;
class KeywordFinderTest {
    KeywordFinder keywordFinder = new KeywordFinder();
    @Test
    void testFindElegant() {
        String sentence = ("The elephant is lifted eleven floors easily with the help of an electricity elevator");
        Predicate<String> condition = word -> (word.startsWith("ele"));
        List<String> filtered = keywordFinder.filter(sentence, condition);
        List<String> expected = Arrays.asList("elephant", "eleven", "electricity", "elevator");
        Assertions.assertEquals(expected, filtered);
    }
    @Test
    void TestfindPlayful(){
        String sentence = "The rightful heir of the powerful king had an awful accident playing with a colorful bear";
        Predicate<String> condition = word -> (word.endsWith("ful"));
        List<String> filtered = keywordFinder.filter(sentence, condition);
        List<String> expected = Arrays.asList("rightful","powerful","awful","colorful");
        Assertions.assertEquals(expected, filtered);
    }
}