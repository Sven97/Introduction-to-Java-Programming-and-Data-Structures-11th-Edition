/**
 * (Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that plays
 * the scissor-rock-paper game. Revise the program to let the user continuously play
 * until either the user or the computer wins three times more than their opponent.
 *
 * Created by Sven on 4/14/2019.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0534_Game_scissor_rock_paper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userWinCounter = 0, computerWinCounter = 0;
        while (Math.abs(userWinCounter - computerWinCounter) < 3) {
            System.out.print("scissor (0), rock (1), paper (2): ");
            int userInput = input.nextInt();
            int computer = (int) (Math.random() * 3);

            // The code can be optimized using "method" in chapter 6
            String userStr = "", computerStr = "", resultStr = "";
            switch (userInput) {
                case 0:
                    userStr = "scissor";
                    break;
                case 1:
                    userStr = "rock";
                    break;
                case 2:
                    userStr = "paper";
                    break;
                default:
                    userStr = "Invalid Input";
            }

            switch (computer) {
                case 0:
                    computerStr = "scissor";
                    break;
                case 1:
                    computerStr = "rock";
                    break;
                case 2:
                    computerStr = "paper";
                    break;
            }


            int result = userInput - computer;
            switch (result) {
                case -2:
                case 1:
                    resultStr = ". You won.";
                    userWinCounter++;
                    break;
                case 0:
                    resultStr = " too. It is a draw";
                    break;
                default:
                    resultStr = ". You lost.";
                    computerWinCounter++;
            }
            System.out.println("The computer is " + computerStr + ". You are " + userStr + resultStr);
            System.out.println("You VS Computer: " + userWinCounter + " : " + computerWinCounter);
        }
        System.out.println("Game Over");
    }
}
