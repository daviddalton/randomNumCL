package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Type exit to quit if you would like.\n");

        while (true) {
            // Get a MIN
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a minimum:");
            String minimum = input.nextLine();

            if (minimum.equals("exit")) {
                break;
            }

            //Get a MAX
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter a max:");
            String maximum = input2.nextLine();

            if (maximum.equals("exit")) {
                break;
            }

            if (!minimum.equals("")) {
                if (!maximum.equals("")) {
                    getRandomNumber(minimum, maximum);
                }
            }

        }

    }

    public static void getRandomNumber(String min, String max) {
        //Convert the Strings to Ints
        int minNum = Integer.parseInt(min);
        int maxNum = Integer.parseInt(max);

        //is there any way to format this if section in a "switch case" format? It might be easier to read.

        if (minNum >= 0) {
            if (maxNum > minNum) {
                //Get a random number
                Random randomNumber = new Random();
                System.out.println("Random number is: " + randomNumber.nextInt((maxNum - minNum) + 1) + minNum);
            } else {
                System.out.println("Max must be larger than Min");
            }
        } else {
            System.out.println("No negatives allowed!");
        }
    }
}
