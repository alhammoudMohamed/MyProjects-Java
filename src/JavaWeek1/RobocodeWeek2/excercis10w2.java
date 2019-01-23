package JavaWeek1.RobocodeWeek2;

import java.util.Scanner;

class excercis10 {


    public static void main(String[] args) {

        System.out.println("tell me your first number");
        Scanner scanner = new Scanner(System.in);
        Integer answer1 = scanner.nextInt();
        System.out.println("tell me your second number");
        Integer answer2 = scanner.nextInt();
        Integer Square = answer1 * answer2;
        System.out.println("the square is " + Square);

    }
}