/**
 * (Sum the digits in an integer) Write a method that computes the sum of the digits
 * in an integer. Use the following method header:
 * public static int sumDigits(long n)
 * For example, sumDigits(234) returns 9 (= 2 + 3 + 4). (Hint: Use the % operator
 * to extract digits and the / operator to remove the extracted digit. For instance,
 * to extract 4 from 234, use 234 % 10 (= 4 ). To remove 4 from 234, use 234 / 10
 * (= 2 3 ). Use a loop to repeatedly extract and remove the digit until all the digits
 * are extracted. Write a test program that prompts the user to enter an integer then
 * displays the sum of all its digits.
 *
 * Created by Sven on 06/16/19.
 */
package Chapter06;

import java.util.Scanner;

public class Exercise0602_Sum_the_digits_in_an_integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int integer = input.nextInt();

        System.out.println("The sum of the digits in " + integer + " is " + sumDigits(integer));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
