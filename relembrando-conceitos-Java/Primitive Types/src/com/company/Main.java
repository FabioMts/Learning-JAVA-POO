package com.company;

public class Main {

    public static void main(String[] args) {

        byte numberOne = 10;
        short numberTwo = 20;
        int numberThree = 50;

        long number = 50000 + (10 * (numberOne + numberTwo + numberThree));
        System.out.println(number);
    }
}
