package JavaWeek8.ReviewExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedInstructions implements Instruction {

    @Override
    public String getUniqueInstrucition(String line) {
         String text = line.replaceAll("&", "");
         List<String>letters = Arrays.asList(text.split(""));
         Collections.reverse(letters);
         String joined = String.join("", letters);
        return joined;
    }




    @Override
    public boolean isUniuqeInsturction(String line) {
        return line.contains("&");
    }
}