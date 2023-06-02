package com.aar.gg;

//The task is to write a Java program in which a user will get K trials to guess a randomly generated number. Below are the rules of the game:
//If the guessed number is bigger than the actual number, the program will respond with the message that the guessed number is higher than the actual number.
//If the guessed number is smaller than the actual number, the program will respond with the message that the guessed number is lower than the actual number.
//If the guessed number is equal to the actual number or if the K trials are exhausted, the program will end with a suitable message.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the guessing game !");
        Scanner scan = new Scanner(System.in);

        Random rand = new Random();
        int actualNo = rand.nextInt(50);

        int trials = 5;

        for(int i= 1; i <= trials ; i++){
            System.out.println("Please enter a number between 1 - 50 :");
            int userNo = scan.nextInt();

            if(userNo > actualNo) {
                System.out.println("Wrong ! Your guess number is bigger than the actual number");
            } else if (userNo < actualNo ) {
                System.out.println("Wrong ! Your guess number is smaller than the actual number");
            } else if (userNo == actualNo) {
                System.out.println("Congrats ! You're guessing it right");
                break;
            }

            if (i == trials) {
                System.out.println("Unfortunately, you have used all the trials");
                System.out.println("The actual number is: " + actualNo);
            } else {
                System.out.println("You have used " + i + " trials (limit:5) ");
                System.out.println();
            }

        }

    }
}
