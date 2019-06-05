/**
 * (Statistics: compute mean and standard deviation) In business applications, you
 * are often asked to compute the mean and standard deviation of data. The mean is
 * simply the average of the numbers. The standard deviation is a statistic that tells
 * you how tightly all the various data are clustered around the mean in a set of data.
 * For example, what is the average age of the students in a class? How close are the
 * ages? If all the students are the same age, the deviation is 0.
 * Write a program that prompts the user to enter 10 numbers and displays the mean
 * and standard deviations of these numbers using the following formula:
 *
 * Here is a sample run:
 * Enter 10 numbers: 1 2 3 4.5 5.6 6 7 8 9 10
 * The mean is 5.61
 * The standard deviation is 2.99794
 *
 * Created by Sven on 06/05/19.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0545_Statistics_compute_mean_and_standard_deviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");

        double sum = 0.0;
        double square_sum = 0.0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            double next = input.nextDouble();
            sum += next;
            square_sum += Math.pow(next, 2);
            count++;
        }

        System.out.println("The mean is " + sum / count);
        System.out.println("The standard deviation is " + Math.sqrt((square_sum - (Math.pow(sum, 2) / count)) / (count - 1)));
    }
}
