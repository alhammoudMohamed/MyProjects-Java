package JavaWeek4.Exercise11;

import JavaWeek4.Exercise9.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HappienseRecorderReader {
    private FileReader reader = new FileReader();
    public List<HappinessRecord> asList(){
        List<String> lines = getLines();
        List<HappinessRecord> records = toHappinessRecords(lines);
        return records;

    }

    private List<HappinessRecord> toHappinessRecords(List<String> lines) {
        List<HappinessRecord> records = new ArrayList<>();
        lines.remove(0);
        for(String line : lines){
            records.add(toHappinessRecord(line));


        }
        return records;
    }

    private HappinessRecord toHappinessRecord(String line) {
        String[] split = line.split(";");
        List<String> columns = Arrays.asList(split);
        String country = columns.get(0);
        String rank = columns.get(1);
        String score = columns.get(2);
        return new HappinessRecord(country,Integer.valueOf(rank), Double.valueOf(score));
    }

    private List<String> getLines() {
        return reader.asLines("JavaWeek4/Exercise11/world-happiness-2017.csv");
    }
}
