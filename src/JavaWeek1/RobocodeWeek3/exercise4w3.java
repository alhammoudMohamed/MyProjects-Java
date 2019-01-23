package JavaWeek1.RobocodeWeek3;

import java.util.ArrayList;
import java.util.List;

public class exercise4w3 {


    public static void main(String[] args) {
        List<Integer> money = new ArrayList<>();
        money.add(4);
        money.add(12);
        money.add(2);
        money.add(5);

        Integer total = 0;

        for (Integer number : money) {


            total = total + number;


        }
        System.out.println(total);
    }


}




