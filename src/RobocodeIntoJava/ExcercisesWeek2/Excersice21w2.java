package RobocodeIntoJava.ExcercisesWeek2;

import java.util.Scanner;

class Excersice21 {
    public static  void main(String[] args) {

        System.out.println("What is the last episode number you watched? ");
        Scanner scanner = new Scanner(System.in);
        Double episode = scanner.nextDouble();
        Double season2 = (episode % 12) * Math.floor(episode / 12) + (12 * Math.floor(episode / 24));
        Double season1 = episode - season2;
        Double season2minutes = season2 * 34;
        Double season1minutes = season1 * 47;
        double totalMinutes = season1minutes + season2minutes;
        double hours = totalMinutes / 60;
        hours = Math.floor(hours);
        double minutes = totalMinutes % 60;
        String message = "you have watched a total of ";
        message = message + hours + " hours and " + minutes + "Minutes";
        message = message + totalMinutes + " ";
        System.out.println(message);

    }
}

