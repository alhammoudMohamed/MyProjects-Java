package JavaWeek7.Exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NicknamesApplication {
    public static void main(String[] args) {
        NickNameGenerator nickNameGenerator = new NickNameGenerator();
        List<String> names = Arrays.asList("House", "Tree", "Theater", "Somewhere", "Bottle");

        for (String name : names) {
            Optional<String> nickname = nickNameGenerator.cutWords(name);
            if (nickname.isPresent()) {
                System.out.println("The nickname of " + name + " is " + nickname.get());
            }

        }

    }
}

