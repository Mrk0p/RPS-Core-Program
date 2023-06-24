package com.bridgelabz.core_program;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year :");
        int year = scanner.nextInt();

        if (year >= 1000 && year <= 9999) {
            System.out.println("4 digit number :"+ year);

            if (year % 400 == 0) {
                System.out.println("This is a leap year :"+ year);
            }
            else if (year % 4 == 0 && year % 100 !=0) {
                System.out.println("This is a leap year :"+ year);
            }
            else {
                System.out.println("This is not a leap year :"+ year);
            }
        }

    }
}
