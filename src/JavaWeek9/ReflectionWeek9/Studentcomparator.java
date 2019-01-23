package JavaWeek9.ReflectionWeek9;
import java.util.List;
import java.util.stream.Collectors;

public class Studentcomparator {
    private StudentReader reader = new StudentReader();


    public Integer getNumbersOfBoysAndGirls() {
        return reader.getStudents().stream()
                .collect(Collectors.toList())
                .size();
    }

    public Long getNumberOfGirls() {
        return reader.getStudents().stream()
                .filter(s -> s.getGender().equals("female"))
                .count();
    }
    public Long getNumberOfBoys() {
        return reader.getStudents().stream()
                .filter(s -> s.getGender().equals("male"))
               .count();
    }
    public List<String> getEducationsAlphabeticallySorted() {
        return reader.getStudents().stream()
                .map(s->s.getEducation())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
    public Long getScoreAboveNinty() {
        return reader.getStudents().stream()
                .filter(s -> s.getWritingScore() > 90)
                .filter(s -> s.getReadingScore() > 90)
                .filter(s -> s.getMathScore() > 90)
                .count();
    }
    public Long getStudentsWithHundred() {
        return reader.getStudents().stream()
                .filter(s -> s.getMathScore().equals(100))
                .filter(s -> s.getReadingScore().equals(100))
                .filter(s -> s.getWritingScore().equals(100))
                .count();
    }
    public List<Student> getStudentsWithHundredGenders() {
        return reader.getStudents().stream()
                .filter(s -> s.getMathScore().equals(100))
                .filter(s -> s.getReadingScore().equals(100))
                .filter(s -> s.getWritingScore().equals(100))
                .collect(Collectors.toList());
    }
}