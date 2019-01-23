package JavaWeek10.Exercise4;

import JavaWeek4.Exercise9.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class GotReader {
    FileReader reader = new FileReader();

    public List<Charachter> getCharachters() {
        return reader.asStream("JavaWeek10/Exercise4/got-characters.csv")
                .skip(1)
                .map(line -> line.split(";"))
                .map(columns -> new Charachter(
                        columns[0],
                        columns[1],
                        columns[2],
                        columns[3],
                        columns[4],
                        columns[5],
                        Integer.valueOf(columns[6]),
                        Integer.valueOf(columns[7])))
                .collect(Collectors.toList());


    }
}
