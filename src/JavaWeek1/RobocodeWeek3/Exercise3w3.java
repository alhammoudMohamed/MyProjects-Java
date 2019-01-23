package JavaWeek1.RobocodeWeek3;

import java.util.Scanner;

public class Exercise3w3 {
    public static void main(String[] args) {
        if(!isWearingAHat() &&! isBringingAPet()) {
            System.out.println("Welcome to our Cinema, how may I assist you? ");
        }else    System.out.println("I am sorry, but you are not allowed to enter.");



    }
    private static Boolean isWearingAHat(){
        System.out.println("Are you wearing a hat?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer.equals("yes");

    }
    private static Boolean isBringingAPet(){
        System.out.println("are you bringing a pet?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer.equals("yes");

    }
}
