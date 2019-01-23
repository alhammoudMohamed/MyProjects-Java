package JavaWeek1.RobocodeWeek2;

import java.util.Scanner;

class Exercise20 {
    public static void main(String[] args) {
        System.out.println("Woof food do I get today?");
        Scanner scanner = new Scanner(System.in);
        Integer food = scanner.nextInt();
        Integer jumptimes = 6 * food;
        Integer barktimes = 1 + food;
        System.out.println("Jumps " + jumptimes +  " times and barktimes "  + barktimes + " times");




    }
}
