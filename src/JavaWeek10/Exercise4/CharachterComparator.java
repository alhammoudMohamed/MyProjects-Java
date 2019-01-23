package JavaWeek10.Exercise4;

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

//    public String getDeathPercentage() {
//        return reader.getCharachters().stream()
//                .map(Charachter::getBookOfDeath)
//                .filter(e -> !e.equals(""))
//                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
//                .entrySet().stream()
//                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
//
//
//                .map(getNumberOfDeath() * 100 / (getNumberOfCharachter()))
//                .collect(Collectors.toList());
//
//    }
}
