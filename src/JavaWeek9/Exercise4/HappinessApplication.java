package JavaWeek9.Exercise4;

import JavaWeek4.Exercise11.HappinessRecord;
import JavaWeek4.Exercise9.FileReader;
import java.util.Arrays;
import java.util.Comparator;

public class HappinessApplication {
    public static void main(String[] args) {

        new FileReader().asLines("JavaWeek9/Exercise4/world-happiness-2017.csv").stream()
                .skip(1)
                .map(e -> Arrays.asList(e.split(";")))
                .map(e -> new HappinessRecord(String.valueOf(e.get(0)),Integer.valueOf(e.get(1)),Double.valueOf(e.get(2))))
                .sorted(Comparator.comparing(e->e.getRank()))
                .limit(5)
                .forEach(e-> System.out.println(e));
    }
}