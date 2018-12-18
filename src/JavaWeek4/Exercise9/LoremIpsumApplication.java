package JavaWeek4.Exercise9;

import java.io.File;
import java.util.List;

public class LoremIpsumApplication {
    public static void main(String[] args) {
        FileReader fileReader1 = new FileReader();
        readDocument(fileReader1);



    }
    private static void readDocument  (FileReader reader){
        System.out.println("..... Document");
        List<String> lines = reader.asLines("JavaWeek4/Exercise9/lorem-ipsum.txt");
        for (String line : lines){
            System.out.println(line);
        }
    }
}
