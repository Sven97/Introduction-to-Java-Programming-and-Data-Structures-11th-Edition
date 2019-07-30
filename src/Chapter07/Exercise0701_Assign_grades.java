/**
 * (Assign grades) Write a program that reads student scores, gets the best score, and
 * then assigns grades based on the following scheme:
 * Grade is A if score is Ú best -5
 * Grade is B if score is Ú best -10;
 * Grade is C if score is Ú best -15;
 * Grade is D if score is Ú best -20;
 * Grade is F otherwise.
 * The program prompts the user to enter the total number of students, and then
 * prompts the user to enter all of the scores, and concludes by displaying the grades.
 * Here is a sample run:
 * Enter the number of students: 4
 * Enter 4 scores: 40 55 70 58
 * Student 0 score is 40 and grade is F
 * Student 1 score is 55 and grade is C
 * Student 2 score is 70 and grade is A
 * Student 3 score is 58 and grade is C
 *
 * Created by Sven on 07/30/19.
 */
package Chapter07;


import java.util.Scanner;

public class Exercise0701_Assign_grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numOfStu = input.nextInt();

        System.out.print("Enter " + numOfStu + (numOfStu == 1 ? " score: " : " scores: "));
        int[] scores = new int[numOfStu];
        int best = 0;
        for (int i = 0; i < numOfStu; i++) {
            scores[i] = input.nextInt();
            if (i == 0) {
                best = scores[i];
            } else {
                if (scores[i] > best) {
                    best = scores[i];
                }
            }
        }

        for (int i = 0; i < numOfStu; i++) {
            System.out.printf("Student %d score is %d and grade is %s\n", i, scores[i], getGrade(best, scores[i]));
        }
    }

    public static String getGrade(int best, int score) {
        int difference = best - score;
        if (difference <= 5) {
            return "A";
        } else if (difference <= 10) {
            return "B";
        } else if (difference <= 15) {
            return "C";
        } else if (difference <= 20) {
            return "D";
        } else {
            return "F";
        }
    }
}
