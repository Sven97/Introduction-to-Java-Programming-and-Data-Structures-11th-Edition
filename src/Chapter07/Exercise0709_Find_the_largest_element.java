/**
 * (Find the largest element) Write a method that finds the largest element in an array
 * of double values using the following header:
 * public static double max(double[] array)
 * Write a test program that prompts the user to enter ten numbers, invokes this
 * method to return the maximum value, and displays the maximum value. Here is
 * a sample run of the program:
 * Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
 * The minimum number is: 6
 *
 * Created by Sven on 08/05/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0709_Find_the_largest_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("The maximum number is: " + max(numbers));
    }

    public static double max(double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
