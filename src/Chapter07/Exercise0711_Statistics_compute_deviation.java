/**
 * (Statistics: compute deviation) Programming Exercise 5.45 computes the standard
 * deviation of numbers. This exercise uses a different but equivalent formula to
 * compute the standard deviation of n numbers.
 * To compute the standard deviation with this formula, you have to store the individual
 * numbers using an array, so they can be used after the mean is obtained.
 * Your program should contain the following methods:
 * Write a test program that prompts the user to enter 10numbers and displays the
 * mean and standard deviation,as presented in the following sample run:
 *
 * Enter 10 numbers: 1.9 2.5 3.7 2 1 6 3 4 5 2
 * The mean is 3.11
 * The standard deviation is 1.55738
 *
 * Created by Sven on 08/08/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0711_Statistics_compute_deviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("The mean is " + mean(numbers));
        System.out.println("The standard deviation is " + deviation(numbers));
    }

    /**
     * Compute the deviation of double values
     */
    public static double deviation(double[] x) {
        double mean = mean(x);

        double square_sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            square_sum += Math.pow((x[i] - mean), 2);
        }

        return Math.sqrt(square_sum / (x.length - 1));
    }

    /**
     * Compute the mean of an array of double values
     */
    public static double mean(double[] x) {
        double sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum / x.length;
    }
}
