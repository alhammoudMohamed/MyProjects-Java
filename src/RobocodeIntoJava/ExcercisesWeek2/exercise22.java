package RobocodeIntoJava.ExcercisesWeek2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exercise22 {
    public static  void main(String[] args) {
        System.out.println(" Please give me a number");
        Scanner scanner = new Scanner(System.in);
        Integer number1 = scanner.nextInt();
        System.out.println(" Please give me a number");
        Integer number2 = scanner.nextInt();
        System.out.println(" Please give me a number");
        Integer number3 = scanner.nextInt();
        Integer number = number1 * number2 * number3 * (199);
        Integer personnumber = number % 3;
        List<String> names = new ArrayList<>();
        names.add("Derek");
        names.add("Matilda");
        names.add("Hansel");
        List<String> rooms = new ArrayList<>();
        rooms.add("Living room");
        rooms.add("Studio");
        rooms.add("Bathroom");
        String person1 = names.get(personnumber);
        names = Collections.singletonList(names.remove(0));
        System.out.println(person1 + " gets room " + rooms.get(0));
        rooms.remove(0);
        personnumber = number % 2;
        String person2 = names.get(personnumber);
        names = Collections.singletonList(names.remove(0));
        System.out.println(person2+ " gets room " + rooms.get(0));
        rooms.remove(0);
        String person3 = names.get(0);
        names = Collections.singletonList(names.remove(0));
        System.out.println(person3 + "gets room" + rooms.get(0));
        rooms.remove(0);



    }

}
