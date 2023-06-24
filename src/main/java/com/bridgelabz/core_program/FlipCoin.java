package com.bridgelabz.core_program;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for coin flip .");
        int flip = scanner.nextInt();

        for (int i=1;i <= flip; i++) {
            int coin = random.nextInt();

            if (coin < 0.5) {
                System.out.println("Tails");
            }
            else {
                System.out.println("Heads");
            }
        }
    }
}
