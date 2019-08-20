/**
 * (Sort students) Write a program that prompts the user to enter the number of students,
 * the students’ names, and their scores and prints student names in decreasing
 * order of their scores. Assume the name is a string without spaces, use the Scanner’s
 * next() method to read a name.
 *
 * Created by Sven on 08/20/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0717_Sort_students {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numOfStudents = input.nextInt();
        String[] nameList = new String[numOfStudents];
        double[] scoreList = new double[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Enter student's name: ");
            nameList[i] = input.next();
            System.out.print("Enter " + nameList[i] + "'s score: ");
            scoreList[i] = input.nextDouble();
        }

        // Bubble sort
        for (int i = 0; i < numOfStudents - 1; i++) {
            for (int j = 0; j < numOfStudents - i - 1; j++) {
                if (scoreList[j] < scoreList[j + 1]) {
                    // Swap scoreList[j] and scoreList[j + 1]
                    double scoreTemp = scoreList[j];
                    scoreList[j] = scoreList[j + 1];
                    scoreList[j + 1] = scoreTemp;

                    // Swap nameList[j] and nameList[j+1]
                    String nameTemp = nameList[j];
                    nameList[j] = nameList[j + 1];
                    nameList[j + 1] = nameTemp;
                }
            }
        }

        for (int i = 0; i < numOfStudents; i++) {
            System.out.printf("%-15s%-5.2f\n", nameList[i], scoreList[i]);
        }
    }
}
