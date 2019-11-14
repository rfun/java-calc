package com.rfun;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String input1 = getInput("Enter a numeric value: ");
        String input2 = getInput("Enter a numeric value: ");
        String operation = getInput("Choose an operation (+ - * /): ");


        // Choose a big enough variable here.

        double result = 0;

        // Check which operation.

        switch (operation) {
            case "+":
                result = add(input1, input2);
                break;
            case "-":
                result = subtract(input1, input2);
                break;
            case "*":
                result = multiply(input1, input2);
                break;
            case "/":
                result = divide(input1, input2);
                break;
            default:
                System.out.println("Unrecognized operation!");
                return;
        }

        System.out.println("The answer is " + result);
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static double add(String input1, String input2) {
        double d1 = Double.parseDouble(input1);
        double d2 = Double.parseDouble(input2);
        return d1 + d2;
    }

    private static double subtract(String input1, String input2) {
        double d1 = Double.parseDouble(input1);
        double d2 = Double.parseDouble(input2);
        return d1 - d2;
    }

    private static double multiply(String input1, String input2) {
        double d1 = Double.parseDouble(input1);
        double d2 = Double.parseDouble(input2);
        return d1 * d2;
    }

    private static double divide(String input1, String input2) {
        double d1 = Double.parseDouble(input1);
        double d2 = Double.parseDouble(input2);
        return d1 / d2;
    }

}
