/**
 * (Pattern recognition: consecutive four equal numbers) Write the following method
 * that tests whether the array has four consecutive numbers with the same value:
 * public static boolean isConsecutiveFour(int[] values)
 * Write a test program that prompts the user to enter a series of integers and displays
 * it if the series contains four consecutive numbers with the same value. Your
 * program should first prompt the user to enter the input size—i.e., the number of
 * values in the series. Here are sample runs:
 *
 * Enter the number of values: 8
 * Enter the values: 3 4 5 5 5 5 4 5
 * The list has consecutive fours
 * Enter the number of values: 9
 * Enter the values: 3 4 5 5 6 5 5 4 5
 * The list has no consecutive fours
 *
 * Created by Sven on 08/24/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0730_Pattern_recognition_consecutive_four_equal_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int numOfValues = input.nextInt();
        int[] list = new int[numOfValues];
        System.out.print("Enter the values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        System.out.println(isConsecutiveFour(list) ? "The list has consecutive fours" : "The list has no consecutive fours");
    }

    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 0; i < values.length - 4; i++) {
            if (values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i + 3]) {
                return true;
            }
        }
        return false;
    }
}
