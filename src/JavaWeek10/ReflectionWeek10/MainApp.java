package JavaWeek10.ReflectionWeek10;

public class MainApp {
    public static void main(String[] args) {

        StoryOperations operate = new StoryOperations();

          operate.getMostAppearing5Word();

        System.out.println("most appearing five letters : " + operate.getMostAppearing5Letter());
        System.out.println("Number of words : " + operate.getNumberOfWords());
        System.out.println("Number Of distinct words : " + operate.getNumberOfDistinctWords());
        operate.getLongestWord();

    }
}
