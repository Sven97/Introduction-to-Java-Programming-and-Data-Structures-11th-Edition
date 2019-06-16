/**
 * (Display an integer reversed) Write a method with the following header to display
 * an integer in reverse order:
 * public static void reverse(int number)
 * For example, reverse(3456) displays 6543. Write a test program that prompts
 * the user to enter an integer then displays its reversal.
 *
 * Created by Sven on 06/16/19.
 */
package Chapter06;

import java.util.Scanner;

public class Exercise0604_Display_an_integer_reversed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();
        reverse(number);
    }

    public static void reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        System.out.println(reverse);
    }
}
