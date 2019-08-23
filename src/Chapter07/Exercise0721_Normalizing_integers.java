/**
 * (Normalizing integers) Write a program that prompts the user to enter 10 integers,
 * and normalizes the integers to be in the range of 0 to 1 by dividing every integer
 * with the largest integer. Display the 10 normalized real-valued numbers.
 *
 * Created by Sven on 08/22/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0721_Normalizing_integers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        double[] normalizedNumbers = normalize(numbers);

        System.out.print("Normalized numbers: ");
        for (int i = 0; i < normalizedNumbers.length; i++) {
            System.out.print(normalizedNumbers[i] + " ");
        }
    }

    public static double[] normalize(double[] numbers) {
        double[] normalizedNumbers = new double[numbers.length];
        double maxNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            normalizedNumbers[i] = numbers[i] / maxNumber;
        }
        return normalizedNumbers;
    }
}
