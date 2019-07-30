/**
 * (Count occurrence of numbers) Write a program that reads the integers between
 * 1 and 50 and counts the occurrences of each. Assume the input ends with 0. Here
 * is a sample run of the program:
 * Enter the integers between 1 and 50: 2 5 6 5 4 3 23 43 2 0
 * 2 occurs 2 times
 * 3 occurs 1 time
 * 4 occurs 1 time
 * 5 occurs 2 times
 * 6 occurs 1 time
 * 23 occurs 1 time
 * 43 occurs 1 time
 *
 * Created by Sven on 07/30/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0703_Count_occurrence_of_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 50: ");
        int[] occurrence = new int[50];
        while (!input.hasNext("0")) {
            occurrence[input.nextInt()] += 1;
        }

        // Start from 1
        for (int i = 1; i < occurrence.length; i++) {
            if (occurrence[i] != 0) {
                System.out.printf("%d occurs %d %s\n", i, occurrence[i], (occurrence[i] == 1 ? "time" : "times"));
            }
        }
    }
}
