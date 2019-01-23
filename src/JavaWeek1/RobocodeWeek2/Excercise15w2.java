package JavaWeek1.RobocodeWeek2;

import java.util.ArrayList;
import java.util.List;

class Excercise15 {

    public static void main(String[] args) {
        List<String> clothes = new ArrayList<>();
        clothes.add("Blouse");
        clothes.add("Sneakers");
        clothes.add("Tie");
        clothes.add("Sandals");
        clothes.add("Jeans");
        clothes.add("shortpants");
        clothes.add("tank");
        clothes.add("blazer");
        String tank = clothes.get(6);
        String shortpants = clothes.get(5);
        String sneakers = clothes.get(1);

        System.out.println("Hansel will wear a " + tank + " ,"   + shortpants   + ","+ sneakers );





    }
}

