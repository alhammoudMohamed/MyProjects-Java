package RobocodeIntoJava.ExercisesWeek3;

import java.util.ArrayList;
import java.util.List;

public class exercise8w3 {

    public static void main(String[] args) {

        List<Integer> serialNumbers = new ArrayList<>();
        serialNumbers.add(2);
        serialNumbers.add(5);
        serialNumbers.add(6);
        serialNumbers.add(8);
        serialNumbers.add(4);
        List<Integer> teamEven = new ArrayList<>();
        List<Integer> teamOdd = new ArrayList<>();

        for (Integer number : serialNumbers
        ) {
            if (isEven(number)) {
                teamEven.add(number);

            } else teamOdd.add(number);


        }
        System.out.println("team even is " + teamEven);
        System.out.println("team odd is "+ teamOdd);
    }


    private static boolean isEven(Integer number) {
        return number % 2 == 0;
//        if (number % 2 == 0)
//            System.out.println(number + " is even");
//        else
//            System.out.println(number + " is odd");
//
    }
}