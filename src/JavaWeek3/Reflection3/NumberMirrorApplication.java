package JavaWeek3.Reflection3;

import java.util.Scanner;

public class NumberMirrorApplication {
    public static void main(String[] args) {
        System.out.println("give me a number");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        NumberMirror numberMirror = new NumberMirror();
        numberMirror.mirror(number);


    }

}























////
//In the NumberMirrorApplication class main method
//        , ask the user for a number, create a NumberMirror
//        , use it to find its mirror number and display both.
////