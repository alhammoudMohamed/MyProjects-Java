package JavaWeek10.ReflectionWeek10;

import JavaWeek4.Exercise9.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StoryReader {
    FileReader reader = new FileReader();

    public List<String> getLines() {
        return reader.asStream("JavaWeek10/ReflectionWeek10/alice.txt")
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .map(e -> e.replaceAll(",", "")
                        .replaceAll(",", "")
                        .replaceAll(";", "")
                        .replaceAll("’s", "")
                        .replaceAll("’", "")
                        .replaceAll("‘", "")
                        .replaceAll(":", "")
                        .replaceAll("#", "")
                        .replaceAll("/", "")
                        .replaceAll("-", "")
                        .replaceAll("\\.", "")
                        .replaceAll("\\*", "")
                        .replaceAll("\\(", "")
                        .replaceAll("\\)", "")
                        .replaceAll("\\[", "")
                        .replaceAll("\\]", ""))
                .filter(e -> !e.isEmpty())
                .collect(Collectors.toList());


//
//                .flatMap(Stream::of)
//                .filter(e -> !e.isEmpty())
//                .map(letter -> letter.charAt(0))
//                .filter(Character::isAlphabetic)
//                .map(Object::toString)
//                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
//                .entrySet().stream()
//                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
//                .map(e -> e.getKey() + " $ " + e.getValue())
//                .findFirst();
//       // lines.ifPresent(s -> System.out.println(" The lines are : " + s));
    }
}
