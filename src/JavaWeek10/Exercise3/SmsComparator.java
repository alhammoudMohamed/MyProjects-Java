package JavaWeek10.Exercise3;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmsComparator {
    SmsReader reader = new SmsReader();


    public String getHamToSpamRatio() {
        return reader.getSms().stream()
                .map(Sms::getName)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream().sorted((e1, e2) -> e1.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " " + (e.getValue() * 100 / reader.getLinesNumber()) + " % ")
                .collect(Collectors.joining());


    }

    public void getMostAppearingWordInHam() {
        Optional<String> MostAppeared = reader.getSms().stream()
                .filter(e -> e.getName().equalsIgnoreCase("ham"))
                .map(Sms::getText)
                .map(e -> e.split(" "))
                .flatMap(t -> Stream.of(t))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " | " + e.getValue() + " Times")
                .findFirst();

        if (MostAppeared.isPresent()) {
            System.out.println("Most Appearing ham word is " + MostAppeared.get());
        }


    }

    public void getMostUsedHamLetter() {
        final Optional<String> MostUsedHamLetter = reader.getSms().stream()
                .filter(e -> e.getName().equalsIgnoreCase("ham"))
                .map(Sms::getText)
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .map(e -> e.split(""))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " | " + e.getValue() + " Times")
                .findFirst();
        if (MostUsedHamLetter.isPresent())
            System.out.println("Most Appearing Ham Letter is: " + MostUsedHamLetter.get());

    }

    void getLongestSpamMessage() {
        Optional<Integer> longestSpamMessage = reader.getSms().stream()
                .filter(e -> e.getName().equalsIgnoreCase("spam"))
                .mapToInt(e -> e.getText().length())
                .boxed()
                .sorted(Comparator.reverseOrder())
                .findFirst();
        if (longestSpamMessage.isPresent())
            System.out.println("The Longest Spam Message is : " + longestSpamMessage.get());
    }


}
