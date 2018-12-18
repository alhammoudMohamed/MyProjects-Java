package RobocodeIntoJava.ExcercisesWeek2;

import java.util.Scanner;

class excercise19 {

    public static void main(String[] args) {
        System.out.println("Welcome to our comic shop. how much do you have to pay?");
        Scanner scanner = new Scanner(System.in);
        Double price = scanner.nextDouble();
        System.out.println("How much are you going to pay?");
        Double moneypaid = scanner.nextDouble();
        Double change = moneypaid - price;
        long euro = Math.round(change);
        Double cent = (change * 100)% 100;
        System.out.println("here you are, "+ euro + " euros " + " and " + " cent " + cent );


    }
}
