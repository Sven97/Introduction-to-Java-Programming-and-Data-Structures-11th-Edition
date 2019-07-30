/**
 * (Analyze scores) Write a program that reads an unspecified number of scores and
 * determines how many scores are above or equal to the average, and how many
 * scores are below the average. Enter a negative number to signify the end of the
 * input. Assume the maximum number of scores is 100.
 *
 * Created by Sven on 07/30/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0704_Analyze_scores {
    public static void main(String[] args) {
        final int MAX_LENGTH = 100;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter scores (negative number signifies end): ");

        double[] scores = new double[MAX_LENGTH];
        int numOfScores = 0;
        double sum = 0;
        for (; numOfScores < scores.length; numOfScores++) {
            double score = input.nextDouble();
            if (score < 0) {
                break;
            } else {
                scores[numOfScores] = score;
                sum += score;
            }
        }

        double average = sum / numOfScores;
        int aboveOrEqualCount = 0;
        int belowCount = 0;
        for (int i = 0; i < numOfScores; i++) {
            if (scores[i] >= average) {
                aboveOrEqualCount++;
            } else {
                belowCount++;
            }
        }

        System.out.println("Average: " + average);
        System.out.println("Number of scores are above or equal to the average: " + aboveOrEqualCount);
        System.out.println("Number of scores are below the average: " + belowCount);
    }
}
