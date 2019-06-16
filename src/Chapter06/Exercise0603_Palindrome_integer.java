/**
 * (Palindrome integer) Write the methods with the following headers:
 * // Return the reversal of an integer, e.g., reverse(456) returns 654
 * public static int reverse(int number)
 * // Return true if number is a palindrome
 * public static boolean isPalindrome(int number)
 * Use the reverse method to implement isPalindrome. A number is a palindrome
 * if its reversal is the same as itself. Write a test program that prompts the
 * user to enter an integer and reports whether the integer is a palindrome.
 *
 * Created by Sven on 06/16/19.
 */
package Chapter06;

import java.util.Scanner;

public class Exercise0603_Palindrome_integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();
        System.out.println(isPalindrome(number) ? (number + " is a palindrome integer") : (number + " is not a palindrome integer"));
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return reverse;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
