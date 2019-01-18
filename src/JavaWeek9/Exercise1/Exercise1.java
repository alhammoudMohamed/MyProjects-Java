package JavaWeek9.Exercise1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Exercise1 {
    public static void main(String[] args) {


        List<Integer>numbers = new ArrayList<>();
        for (int number = 1; number <21 ; number++) {
            numbers.add(number);
        }
        System.out.println("Numbers : " + numbers);
         List<Integer> EvenNumbers = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + EvenNumbers);





        List<Integer>OddNumbers = numbers.stream()
                .filter( e -> e % 2 == 1)
                .collect(Collectors.toList());
        System.out.println("Odd numbers: " + OddNumbers);
        final List<Integer> Divisible = numbers.stream()
                .filter(e -> e % 3 == 0 && e > 10)
                .collect(Collectors.toList());
        System.out.println("Numbers divisible by 3 and bigger than 10: " + Divisible);






         List<Integer> multiplaid = numbers.stream()
                .filter(e -> e < 5)
                .map(e -> e * 3)
                .collect(Collectors.toList());
        System.out.println("Numbers smaller than 5 and multiplied by 3 : " + multiplaid);






         List<String> finalMath = numbers.stream()
                .filter(e -> e > 8 && e < 12)
                .map(e -> e.toString())
                .map(e -> "number " + e + " has " + e.length() + " digits")
                .collect(Collectors.toList());
        System.out.println("Digits of numbers bigger than 8 and smaller than 12: " + finalMath);
    }

}
