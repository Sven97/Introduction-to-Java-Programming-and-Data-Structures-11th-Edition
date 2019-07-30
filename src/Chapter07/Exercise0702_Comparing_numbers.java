/**
 * (Comparing numbers) Write a program that reads 11 integers, compares each
 * integer with the 11th integer, and displays whether the integers are “greater”,
 * “smaller”, or “equal” to the 11th integer.
 *
 * Created by Sven on 07/30/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0702_Comparing_numbers {
    public static void main(String[] args) {
        final int LENGTH = 11;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + LENGTH + " numbers: ");
        int[] numbers = new int[LENGTH];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Num #%d(%d), which is %s Num #%d(%d)\n", i, numbers[i], compareInt(numbers[i],
                    numbers[numbers.length - 1]), numbers.length, numbers[numbers.length - 1]);
        }

    }

    public static String compareInt(int num1, int num2) {
        if (num1 == num2) {
            return "equal to";
        } else if (num1 > num2) {
            return "greater than";
        } else {
            return "smaller than";
        }
    }
}
