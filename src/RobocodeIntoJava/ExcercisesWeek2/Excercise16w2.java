package RobocodeIntoJava.ExcercisesWeek2;

import java.util.Scanner;

class Excercise16 {

    public static void main(String[] args) {
        System.out.println("Hello What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Please tell me your order number");
        Integer ordernumber = scanner.nextInt();
        Integer result = ordernumber % 3;
        Integer price = result * 4 ;
        System.out.println(" Here you are, " + name + ". It is " + price + " Euro.");



    }
}
