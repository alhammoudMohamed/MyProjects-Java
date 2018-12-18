package RobocodeIntoJava.ExercisesWeek3;

import java.util.ArrayList;
import java.util.List;

public class exersice9w3 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("lamp");
        words.add("ticket");
        words.add("right");
        words.add("elephant");
        words.add("space");
        List<String> shiftedWords = new ArrayList<>();
        while (words.size() > 0) {
            String word = words.get(0);
            words.remove(0);
            if (isRight(word) && words.size() > 0) {
                String nextword = words.get(0);
                words.remove(0);
                shiftedWords.add(nextword);


            }
            shiftedWords.add(word);


        }
        System.out.println("words: " + words);
        System.out.println("Shifted Words: " + shiftedWords);


    }

    private static Boolean isRight(String word) {

        return word.equals("right");
    }
}
