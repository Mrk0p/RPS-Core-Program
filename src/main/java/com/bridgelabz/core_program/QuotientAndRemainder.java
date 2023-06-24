package com.bridgelabz.core_program;

import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dividend number :");
        int a = scanner.nextInt();

        System.out.println("Enter divisor number :");
        int b = scanner.nextInt();

        int q = a/b;
        int r = a%b;

        System.out.println("Quotient is :"+ q);
        System.out.println("Remainder is :"+ r);
    }
}
