package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("result = " + result);
        System.out.println("previousResult = " + previousResult);

        result *= 10;
        System.out.println("result = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It\'s not an alien!");
            System.out.println("And I am scared of aliens.");
        }

        int topScore = 100;
        if(topScore == 100) {
            System.out.println("You got the high score!");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error.");
        }

        

    }
}
