package JavaWeek1.RobocodeWeek3;

import java.util.ArrayList;
import java.util.List;

public class Exercise5w3 {

    public static void main(String[] args) {
        List<String> Words = new ArrayList<>();
        Words.add("house");
        Words.add("tree");
        Words.add("theater");
        Words.add("somewhere");
        Words.add("bottle");
        List<String> Nicknames = new ArrayList<>();
        for (String word : Words
        ) {
            Integer endofword = Words.size() / 2;
            endofword = Math.round(endofword);
            String nickname = word.substring(0, endofword-1);
            Nicknames.add(nickname);


        }
        System.out.println(Nicknames);

    }
}
