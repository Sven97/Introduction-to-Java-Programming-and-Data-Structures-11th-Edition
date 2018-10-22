/**
 * (Hex to binary) Write a program that prompts the user to enter a hex digit and
 * displays its corresponding binary number. For an incorrect input, display invalid
 * input.
 *
 * Here is a sample run:
 * Enter a hex digit: B
 * The binary value is 1011
 * Enter a hex digit: G
 * G is an invalid input
 *
 * Created by Sven on 10/22/2018.
 */
package Chapter04;

import java.util.Scanner;

public class Exercise0412_Hex_to_binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String chars = input.next().toUpperCase();
        char character = chars.charAt(0);

        String digits = "0123456789ABCDEF";
        int decVal = digits.indexOf(character);
        if (decVal == -1) {
            System.out.println(character + " is an invalid input");
        } else {
            String binval = Integer.toBinaryString(decVal);
            System.out.println("The binary value is " + binval);
        }
    }
}
