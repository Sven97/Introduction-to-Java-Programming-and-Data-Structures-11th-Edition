/**
 * (Game: heads or tails) Write a program that lets the user guess whether the flip of a coin results in heads or tails.
 * The program randomly generates an integer 0 or 1, which represents head or tail. The program prompts the user to
 * enter a guess and reports whether the guess is correct or incorrect.
 *
 * Created by Sven on 8/22/2018.
 */
package Chapter03;

import java.util.Scanner;


public class Exercise0314_Game_heads_or_tails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Guess the result of a coin flip, Enter 0 for heads and 1 for tails: ");
        int userInput = input.nextInt();

        System.out.print("Coin flipping...");
        int coinSide = (int) (Math.random() * 2);

        if (coinSide == 0) {
            System.out.print("It is heads. \nYour guess is ");
            System.out.println(userInput == 0 ? " heads, good job!" : "tails, try again!");
        } else {
            System.out.print("It is tails. \nYour guess is ");
            System.out.println(userInput != 0 ? " heads, good job!" : "tails, try again!");
        }
    }
}
