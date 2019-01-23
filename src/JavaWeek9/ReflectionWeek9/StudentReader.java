package JavaWeek9.ReflectionWeek9;

import JavaWeek4.Exercise9.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StudentReader {

    private FileReader fileReader  = new FileReader();

    public List<Student> getStudents(){
        return fileReader.asStream("JavaWeek10/Exercise2/students-performance.csv")
                .skip(1)
                .map(line->line.split(";"))
                .map(columns->new Student(
                        columns[0],
                        columns[1],
                        Integer.valueOf(columns[2]),
                        Integer.valueOf(columns[3]),
                        Integer.valueOf(columns[4])))
                .collect(Collectors.toList());
    }
}
