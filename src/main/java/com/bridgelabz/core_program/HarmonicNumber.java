package com.bridgelabz.core_program;

import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");

        int x = scanner.nextInt();
        double num = 0.0;
        if (x > 0) {
            double i;
            for (i = 1; i <= x; i++) {
                num = (1/i) + num;
                System.out.println(num);
            }
        }
        else {
            System.out.println("Invalid number .");
        }
    }
}
