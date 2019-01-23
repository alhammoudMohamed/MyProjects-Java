package JavaWeek10.Exercise2;

public class main {
    public static void main(String[] args) {

        StudentComparator comparator = new StudentComparator();


        displayEducationLevelAppearence(comparator);


        displayEducationLevelsSortedTopToBottom(comparator);

        displayMasterDegreeStudentsWithSocreLowerThan60(comparator);


        displayScoreAndGendersOfTopThreeStudents(comparator);

        isThreeAnyStudentWithEcuationLeveSomeHighSchoolWithAtLeast95InEverTopic(comparator);

    }


    private static void isThreeAnyStudentWithEcuationLeveSomeHighSchoolWithAtLeast95InEverTopic(StudentComparator comparator) {
        System.out.println("Is there any student with a parent education level of some high school that has at least 95 in every topic?");
        System.out.println(comparator.IsThereAnyStudentWithEducationLevelofSomehigSchoolWith95InEverytopic());
    }

    private static void displayScoreAndGendersOfTopThreeStudents(StudentComparator comparator) {
        System.out.println("Genders and average scores of the top four average score students:");
        System.out.println(comparator.getTopFourStudentsAveregeScoreAndGender());
    }

    private static void displayMasterDegreeStudentsWithSocreLowerThan60(StudentComparator comparator) {
        System.out.println("Number of students with master degree  education and lower scores than 60:");
        System.out.println(comparator.getNumberOfStudentsWithMasterDegreeAndLowerGradeThanSixtyOnEachTopic());
    }


    private static void displayEducationLevelsSortedTopToBottom(StudentComparator comparator) {
        System.out.println("Parent education level appearances sorted top bottom:");
        System.out.println(comparator.EducationLevelSortedTopToBottom());
    }

    private static void displayEducationLevelAppearence(StudentComparator comparator) {
        System.out.println("Parent education level appearances: ");
        System.out.println(comparator.getNumberOfEducationAppearence());
    }
}
