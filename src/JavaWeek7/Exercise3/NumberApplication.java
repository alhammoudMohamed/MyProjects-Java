package JavaWeek7.Exercise3;

import JavaWeek7.Exercise3.NumberJudge;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NumberApplication {
    public static void main(String[] args) {
        NumberJudge numberJudge = new NumberJudge();
        List<Integer> numbers = Arrays.asList(2,3,5,4,9,6,7,8,3,5,4);
         Optional<Integer> biggest = numberJudge.getBiggest(numbers);
         Optional<Integer> smallest = numberJudge.getSmallest(numbers);
        System.out.println("The biggest number is : " + biggest);
        System.out.println("The smallest number is : " + smallest);

    }
}
