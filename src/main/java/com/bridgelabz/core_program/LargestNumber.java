package com.bridgelabz.core_program;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int a = scanner.nextInt();

        System.out.println("Enter 2nd number: ");
        int b = scanner.nextInt();

        System.out.println("Enter 3rd number: ");
        int c = scanner.nextInt();

        if (a>b && a>c){
            System.out.println(a+" is a largest number.");
        }
        else if (b>a && b>c)
        {
            System.out.println(b+" is a largest number.");
        }
        else if (c>a && c>b)
        {
            System.out.println(c + " is a largest number.");
        }
        else {
            System.out.println("All are equal");
        }
    }
}
