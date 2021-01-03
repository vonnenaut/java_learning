package com.company;

import academy.learnprogramming.Doctor;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    var scanner = new Scanner(System.in);

        System.out.println(Doctor.intro());

        var userInput = "";

        while(!userInput.equalsIgnoreCase("quit")) {
            userInput = scanner.nextLine();
            String response = Doctor.response(userInput);
            System.out.println(response);
        }

	    scanner.close();
    }
}
