package JavaWeek10.ReflectionWeek10;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StoryOperations {
    StoryReader reader = new StoryReader();

    public void getMostAppearing5Word() {

         Stream<String> word = reader.getLines().stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " | appears " + e.getValue() + " times")
                .limit(5);




    }

    public Stream<String> getMostAppearing5Letter() {
        return reader.getLines().stream()
                .map(e -> e.split(""))
                .flatMap(Stream::of)
                //.map(letter -> letter.charAt(0))
                //.filter(Character::isAlphabetic)
                //.map(Object::toString)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " | " + e.getValue())
                .limit(5);


    }


    public Long getNumberOfWords() {
        return reader.getLines().stream()
                .count();


    }

    public Long getNumberOfDistinctWords() {
        return reader.getLines().stream()
                .distinct()
                .count();
    }

    public void getLongestWord() {
        Optional<Map.Entry<Integer, Long>> longestWord = reader.getLines().stream()
                .map(String::length)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .findFirst();


        longestWord.ifPresent(stringLongEntry -> System.out.println(" the longest word is : " + stringLongEntry));

    }


}