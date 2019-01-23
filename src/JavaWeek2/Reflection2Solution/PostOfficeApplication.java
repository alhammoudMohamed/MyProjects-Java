package JavaWeek2.Reflection2Solution;

import java.util.ArrayList;
import java.util.List;

public class PostOfficeApplication {
    public static void main(String[] args) {


        Letter letter = new Letter("NBH");
        PostOfficeAssistant assistant = new PostOfficeAssistant();
        assistant.stamp(letter);
        assistant.send(letter);

        List<Letter> letters = new ArrayList<>();
        letters.add(new Letter("NBH"));
        letters.add(new Letter("school"));
        letters.add(new Letter("work"));
        Postman postman = new Postman(letters);
        postman.deliver();




    }
}