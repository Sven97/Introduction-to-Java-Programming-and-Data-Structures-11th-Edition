/**
 * (Game: scissor, rock, paper) Write a program that plays the popular scissor–rock–
 * paper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
 * wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
 * scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
 * 2 and displays a message indicating whether the user or the computer wins, loses,
 * or draws.
 *
 * Here are sample runs:
 * scissor (0), rock (1), paper (2): 1
 * The computer is scissor. You are rock. You won
 * scissor (0), rock (1), paper (2): 2
 * The computer is paper. You are paper too. It is a draw
 *
 * Created by Sven on 8/23/2018.
 */
package Chapter03;

import java.util.Scanner;

public class Exercise0317_Game_scissor_rock_paper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
                break;
            case 0:
                resultStr = " too. It is a draw";
                break;
            default:
                resultStr = ". You lost.";
        }
        System.out.println("The computer is " + computerStr + ". You are " + userStr + resultStr);
    }
}
