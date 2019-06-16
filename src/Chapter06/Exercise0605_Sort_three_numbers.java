/**
 * (Sort three numbers) Write a method with the following header to display three
 * numbers in decreasing order:
 * public static void displaySortedNumbers(
 * double num1, double num2, double num3)
 * Write a test program that prompts the user to enter three numbers and invokes the
 * method to display them in decreasing order.
 *
 * Created by Sven on 06/16/19.
 */
package Chapter06;

import java.util.Scanner;

public class Exercise0605_Sort_three_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp = 0;
        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 < num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
