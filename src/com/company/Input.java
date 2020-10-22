package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface Input {
    static String inputString(String message){
        String line;
        Scanner input = new Scanner(System.in);
        try {
                System.out.print(message);
                line = input.nextLine();
                if (line.isEmpty()) {
                    throw new NullPointerException();
                }
            } catch (NullPointerException e) {
                System.out.println("Incorrect input. Enter a non-empty string");
                line = inputString(message);
            }

        return line;
    }

    static float inputDouble(String message){
        Scanner input = new Scanner(System.in);
        float number = 0;
        try {
            System.out.print(message);
            number = input.nextFloat();
            if (number > Double.MAX_VALUE || number < Double.MIN_VALUE) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input. Enter the number.");
            number = inputDouble(message);
        }
        return number;
    }

    static int inputInteger(String message){
        int number = 0;
        Scanner input = new Scanner(System.in);
        try {
            System.out.print(message);
            number = input.nextInt();
            if (number > Integer.MAX_VALUE || number < Integer.MIN_VALUE) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input. Enter an integer.");
            number = inputInteger(message);
        }
        return number;
    }
}
