package JavaWeek9.Exercise2;

import JavaWeek4.Exercise9.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise2 {


    private FileReader fileReader = new FileReader();
     Stream<String> names = fileReader.asStream("JavaWeek9/Exercise2/names.txt");


    @Test
    void testIsShorterThanFour() {
        List<String> expected = Arrays.asList("El");
        List<String> actual = names
                .filter(e -> e.length() < 4)
                .collect(Collectors.toList());

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testLastLetter() {
        List<String> expected = Arrays.asList("HOSAM", "TAMMAM");
        List<String> actual = names
                .filter(e -> e.endsWith("m"))
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testContainsLetters() {
        List<String> expected = Arrays.asList("Mehran", "Norbert", "Serife");
        List<String> actual = names.filter(e -> e.contains("e") && e.contains("r"))
                .collect(Collectors.toList());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testLenght() {
        List<String> expected = Arrays.asList("maarj", "aamin", "omaar");
         List<String> actual = names.filter(e -> e.length() == 4)
                .map(e -> e.toLowerCase())
                .filter(e -> e.contains("a") && e.contains("m"))
                .map(e -> e.replaceAll("a", "aa"))
                .collect(Collectors.toList());
         Assertions.assertEquals(expected,actual);

    }
}