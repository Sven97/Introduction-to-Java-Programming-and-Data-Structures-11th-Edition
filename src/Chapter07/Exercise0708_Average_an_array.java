/**
 * (Average an array) Write two overloaded methods that return the average of an
 * array with the following headers:
 * public static int average(int[] array)
 * public static double average(double[] array)
 * Write a test program that prompts the user to enter 10 double values, invokes this
 * method, then displays the average value.
 *
 * Created by Sven on 08/05/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0708_Average_an_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("Average: " + average(numbers));
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int num : array)
            sum += num;
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array)
            sum += num;
        return sum / array.length;
    }
}
