package com.bridgelabz.core_program;

import java.util.Scanner;

public class SwapTwoNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number :");
        int a = scanner.nextInt();

        System.out.println("Enter 2nd number :");
        int b = scanner.nextInt();

        int c = 0;

        c = a;
        a = b;
        b = c;

        System.out.println("1st number is :"+ a);
        System.out.println("2nd number is :"+ b);
    }
}
