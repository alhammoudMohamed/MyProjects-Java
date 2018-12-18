package JavaWeek4.Exercise8;

import java.util.Optional;

public class AdvancedGiftApplication {
    public static void main(String[] args) {

        Optional<String>giftBox = Optional.empty();
        System.out.println(giftBox);
        Box Robotoy = new Box("Robotoy");
        giftBox= Optional.of("Robotoy");
        System.out.println(giftBox);
        if(giftBox.isPresent()){
            System.out.println("There is a present in the box");


        }
        System.out.println("The gift is a : " + giftBox.get());


    }

}
