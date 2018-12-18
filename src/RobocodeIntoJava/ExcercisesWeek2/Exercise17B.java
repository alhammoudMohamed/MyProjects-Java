package RobocodeIntoJava.ExcercisesWeek2;

import java.util.ArrayList;
import java.util.List;

public class Exercise17B {

    public static void main(String[] args) {
        List<String> Words = new ArrayList<>();
        List<String> smallLetters = new ArrayList<>();
        Words.add("Please");
        Words.add("No");
        Words.add("ADVERTISMENT");
        System.out.println(Words);
        String word = Words.get(0);
        word = word.toLowerCase();
        smallLetters.add(word);


        word = Words.get(1);
        word = word.toLowerCase();
        smallLetters.add(word);
        word = Words.get(2);
        word = word.toLowerCase();
        smallLetters.add(word);



        System.out.println(smallLetters);


    }
    }
