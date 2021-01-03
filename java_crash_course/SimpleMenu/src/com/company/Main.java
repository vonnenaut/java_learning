package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose one of the following options");
        System.out.println("1 -- Cappucino");
        System.out.println("2 -- Latte");
        System.out.println("3 -- Americano");

        var userChoice = scanner.nextLine();
        System.out.println("You chose " + userChoice);
        scanner.close();

    }
}
