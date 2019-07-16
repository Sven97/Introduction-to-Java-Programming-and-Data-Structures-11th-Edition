/**
 * (Math: approximate the square root) There are several techniques for implementing
 * the sqrt method in the Math class. One such technique is known as the
 * Babylonian method. It approximates the square root of a number, n, by repeatedly
 * performing the calculation using the following formula:
 * nextGuess = (lastGuess + n / lastGuess) / 2
 * When nextGuess and lastGuess are almost identical, nextGuess is the
 * approximated square root. The initial guess can be any positive value (e.g., 1).
 * This value will be the starting value for lastGuess. If the difference between
 * nextGuess and lastGuess is less than a very small number, such as 0.0001,
 * you can claim that nextGuess is the approximated square root of n. If not, nextGuess
 * becomes lastGuess and the approximation process continues. Implement
 * the following method that returns the square root of n:
 * public static double sqrt(long n)
 *
 * Created by Sven on 07/16/19.
 */
package Chapter06;

import java.util.Scanner;

public class Exercise0622_Math_approximate_the_square_root {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        System.out.println("Approximate the square root: " + sqrt(number));
    }

    public static double sqrt(long n) {
        double accuracy = 0.0001;
        double lastGuess = 1;
        double nextGuess = 1;
        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        } while (Math.abs(nextGuess - lastGuess) > accuracy);
        return nextGuess;
    }
}
