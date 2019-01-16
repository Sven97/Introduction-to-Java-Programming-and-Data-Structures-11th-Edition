/**
 * (Pass or fail) Write a program that prompts a student to enter a Java score. If the
 * score is greater or equal to 60, display “you pass the exam”; otherwise, display “you
 * don’t pass the exam”. Your program ends with input -1.
 *
 * Here is a sample run:
 * Enter your score: 80
 * You pass the exam.
 * Enter your score: 59
 * You don't pass the exam.
 * Enter your score: −1
 * No numbers are entered except 0
 *
 * Created by Sven on 11/8/2018.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0501_Pass_or_fail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        while (score != -1) {
            System.out.print("Enter your score: ");
            score = input.nextInt();
            if (score == -1) {
                System.out.println("No numbers are entered except 0");
                break;
            } else if (score < 0) {
                System.out.println("Negative input, please check again.");
            } else if (score > 100) {
                System.out.println("Score won't exceed 100");
            } else if (score >= 60) {
                System.out.println("You pass the exam.");
            } else {
                System.out.println("You fail the exam.");
            }
        }
        System.out.println();
    }
}
