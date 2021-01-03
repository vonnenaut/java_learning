package com.company;

public class Main {

    public static void main(String[] args) {
	    double num1 = 20.00d;
	    double num2 = 80.00d;
	    double sumHun = (num1 + num2) * 100.00d;
	    double remainder = sumHun % 40.00d;

	    boolean noRemainder = (remainder == 0) ? true: false;
        System.out.println("noRemainder = " + noRemainder);

        if (!noRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
