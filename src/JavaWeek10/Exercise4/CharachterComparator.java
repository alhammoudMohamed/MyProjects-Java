package JavaWeek10.Exercise4;

import java.util.Optional;
import java.util.stream.Collectors;

public class CharachterComparator {

    GotReader reader = new GotReader();


    public Long getNumberOfCharachter() {
        return reader.getCharachters().stream()
                .map(Charachter::getName)
                .count();
    }


    public Long getNumberOfDeath() {
        return reader.getCharachters().stream()
                .map(Charachter::getBookOfDeath)
                .filter(e -> !e.equals(""))
                .count();

    }

    public void getBiggestDeathCountBook() {

        Optional<String> longestDeathCountBook = reader.getCharachters().stream()
                .map(Charachter::getBookOfDeath)
                .filter(e -> !e.equals(""))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " |" + e.getValue() + " deaths")
                .findFirst();
        longestDeathCountBook.ifPresent(s -> System.out.println("The Biggest Death Count Book is: " + s));


    }

}
