package JavaWeek4.Exercise4;

import java.util.HashMap;
import java.util.Optional;

public class BasicGiftApplication {

    public static void main(String[] args) {

        Optional<String> giftBox = Optional.empty();
        System.out.println(giftBox);
        giftBox = Optional.of("Robotoy");
        System.out.println(giftBox);
        if(giftBox.isPresent()){
            System.out.println("there is a present in the gift box");

        }

        System.out.println("the gift is a " + giftBox.get());




    }
}
