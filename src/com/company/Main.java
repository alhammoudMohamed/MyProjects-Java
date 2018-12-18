package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("tell me your first number");
        Scanner scanner = new Scanner(System.in);
        Integer answer1 = scanner.nextInt();
        System.out.println("tell me your second number");
        Integer answer2 = scanner.nextInt();
        //Integer sum = answer1 + answer2;
        System.out.println(answer1 + answer2);
    }
}

