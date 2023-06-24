package com.bridgelabz.core_program;

import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args) {
        int num = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int p = scanner.nextInt();
        int power = 1;

        for (int i=1; i <= p; i++) {
            power = power * num;
        }
        System.out.println("2 to the power "+ p +" is :" +power);
    }
}
