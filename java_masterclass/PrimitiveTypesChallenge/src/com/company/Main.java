package com.company;

public class Main {

    public static void main(String[] args) {
        byte aByte = 127;
        short aShort = 30_000;
        int anInt = 523_678;
        long aLong = 50_000L + 10 * (aByte + aShort + anInt);
        System.out.println(aLong);

        short shortTotal = (short) (1000 + 10 *
                (aByte + aShort + anInt));
    }
}
