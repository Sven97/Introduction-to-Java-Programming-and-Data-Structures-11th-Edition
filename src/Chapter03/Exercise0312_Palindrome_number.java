/**
 * (Palindrome integer) Write a program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome integer. An integer is palindrome
 * if it reads the same from right to left and from left to right. A negative integer is
 * treated the same as a positive integer.
 *
 * Here is a sample run of this program:
 * Enter a three-digit integer: 121
 * 121 is a palindrome
 * Enter a three-digit integer: 123
 * 123 is not a palindrome
 *
 * Created by Sven on 8/22/2018.
 */
package Chapter03;

import java.util.Scanner;

public class Exercise0312_Palindrome_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int originalNum = input.nextInt();
        int lastDigit = originalNum % 10;
        int firstDigit = originalNum / 100;
        System.out.print(originalNum);
        System.out.println(lastDigit == firstDigit ? " is a palindrome" : " is not a palindrome");
    }
}
