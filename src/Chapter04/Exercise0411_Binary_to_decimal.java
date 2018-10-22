/**
 * (Binary to decimal) Write a program that prompts the user to enter binary digits
 * and displays its corresponding decimal value.
 *
 * Here are some sample runs:
 * Enter binary digits (0000 to 1111): 0111
 * The decimal value is 7
 * Enter binary digits (0000 to 1111): 1001
 * The decimal value is 9
 * Enter binary digits (0000 to 1111): 1100
 * The decimal value is 12
 *
 * Created by Sven on 10/22/2018.
 */
package Chapter04;

import java.util.Scanner;

public class Exercise0411_Binary_to_decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary digits (0000 to 1111): ");
        char[] chars = input.next().toCharArray();
        int number = 0;

        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '1') {
                number += Math.pow(2, chars.length - 1 - i);
            }
        }
//        if (chars[3] == '1') {
//            number += Math.pow(2, 0);
//        }
//        if (chars[2] == '1') {
//            number += Math.pow(2, 1);
//        }
//        if (chars[1] == '1') {
//            number += Math.pow(2, 2);
//        }
//        if (chars[0] == '1') {
//            number += Math.pow(2, 3);
//        }

        System.out.println("The decimal value is " + number);
    }
}
