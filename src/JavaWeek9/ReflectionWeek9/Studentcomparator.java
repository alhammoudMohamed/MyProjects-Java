package JavaWeek9.ReflectionWeek9;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Studentcomparator {
    private studentReader reader = new studentReader();


    public Integer getNumbersOfBoysAndGirls() {
        return reader.getStudents().stream()
                .collect(Collectors.toList())
                .size();


    }

    public Integer getNumberOfGirls() {
        return reader.getStudents().stream()
                .filter(s -> s.getGender().equals("female"))
                .collect(Collectors.toList())
                .size();
    }


    public Integer getNumberOfBoys() {
        return reader.getStudents().stream()
                .filter(s -> s.getGender().equals("male"))
                .collect(Collectors.toList())
                .size();
    }

    public List<String> getEducationsAlphabeticallySorted() {
        return reader.getStudents().stream()
                .map(s->s.getEducation())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }


    public Integer getScoreAboveNinty() {
        return reader.getStudents().stream()
                .filter(s -> s.getWritingScore() > 90)
                .filter(s -> s.getReadingScore() > 90)
                .filter(s -> s.getMathScore() > 90)
                .collect(Collectors.toList())
                .size();
    }

    public Integer getStudentsWithHundred() {
        return reader.getStudents().stream()
                .filter(s -> s.getMathScore().equals(100))
                .filter(s -> s.getReadingScore().equals(100))
                .filter(s -> s.getWritingScore().equals(100))
                .collect(Collectors.toList())
                .size();

    }

    public List<Student> getStudentsWithHundredGenders() {
        return reader.getStudents().stream()
                .filter(s -> s.getMathScore().equals(100))
                .filter(s -> s.getReadingScore().equals(100))
                .filter(s -> s.getWritingScore().equals(100))
                .collect(Collectors.toList());
    }
}
