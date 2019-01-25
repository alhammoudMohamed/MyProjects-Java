package JavaWeek10.Exercise2;

import JavaWeek9.ReflectionWeek9.StudentReader;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentComparator {

    private StudentReader reader = new StudentReader();

    Map<String, Long> getNumberOfEducationAppearence() {
        return reader.getStudents().stream()
                .map(e -> e.getEducation())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    }
    //when we use collectores.counting we get a map with the key is the element and the value is how many  times its repeated.


    public List<String> EducationLevelSortedTopToBottom() {
        return getNumberOfEducationAppearence().entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + "|" + e.getValue())
                .collect(Collectors.toList());
    }

    public Long getNumberOfStudentsWithMasterDegreeAndLowerGradeThanSixtyOnEachTopic() {
        return reader.getStudents().stream()
                .filter(s -> s.getWritingScore() < 60)
                .filter(s -> s.getReadingScore() < 60)
                .filter(s -> s.getMathScore() < 60)
                .filter(e -> e.getEducation().equalsIgnoreCase("master's degree"))
                .count();
    }


    public List<String> getTopFourStudentsAveregeScoreAndGender() {
        return reader.getStudents().stream()
                .map(e -> ((e.getWritingScore() + e.getReadingScore() + e.getMathScore()) / 3) + "|" + e.getGender())
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());


    }

    Boolean IsThereAnyStudentWithEducationLevelofSomehigSchoolWith95InEverytopic() {
        return reader.getStudents().stream()
                .filter(e -> e.getEducation().equalsIgnoreCase("Some high school"))
                .anyMatch(e -> e.getWritingScore() > 95 && e.getWritingScore() > 95 && e.getReadingScore() > 95);

    }

}