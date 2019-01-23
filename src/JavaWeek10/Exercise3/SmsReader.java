package JavaWeek10.Exercise3;

import JavaWeek4.Exercise9.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class SmsReader {
    FileReader reader = new FileReader();

    public List<Sms> getSms() {
        return reader.asStream("JavaWeek10/Exercise3/sms.csv")
                .skip(1)
                .map(line -> line.split(";"))
                .map(columns -> new Sms(columns[0], columns[1]))
                .collect(Collectors.toList());

    }

    public Long getLinesNumber() {
        return reader.asStream("JavaWeek10/Exercise3/sms.csv")
                .skip(1)
                .count();
    }
}