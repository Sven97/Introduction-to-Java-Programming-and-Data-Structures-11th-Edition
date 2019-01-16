/**
 * (Find the highest score) Write a program that prompts the user to enter the number
 * of students and each student’s name and score, and finally displays the name of
 * the student with the highest score. Use the next() method in the Scanner class
 * to read a name, rather than using the nextLine() method.
 *
 * Created by Sven on 1/16/2019.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0508_Find_the_highest_score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        double highestScore = 0, score = 0;
        String studentWithHighest = "", studentName = "";
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the student’s name and score (eg. Jack 95): ");
            studentName = input.next();
            score = input.nextDouble();

            if (i == 0) {
                highestScore = score;
                studentWithHighest = studentName;
            }

            if (score > highestScore) {
                highestScore = score;
                studentWithHighest = studentName;
            } else if (score == highestScore) {
                studentWithHighest += ", " + studentName;
            }
        }
        System.out.println("The highest score: " + highestScore);
        System.out.println("The student with highest score: " + studentWithHighest);
    }
}
