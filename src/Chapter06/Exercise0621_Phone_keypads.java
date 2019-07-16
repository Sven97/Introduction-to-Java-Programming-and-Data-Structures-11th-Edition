/**
 * (Phone keypads) The international standard letter/number mapping for telephones
 * is given in Programming Exercise 4.15. Write a method that returns a
 * number, given an uppercase letter, as follows:
 * public static int getNumber(char uppercaseLetter)
 * Write a test program that prompts the user to enter a phone number as a string. The input
 * number may contain letters. The program translates a letter (uppercase or lowercase)
 * to a digit and leaves all other characters intact. Here are sample runs of the program:
 *
 * Enter a string: 1-800-Flowers
 * 1-800-3569377
 * Enter a string: 1800flowers
 * 18003569377
 *
 * Created by Sven on 07/16/19.
 */
package Chapter06;

import java.util.Scanner;

public class Exercise0621_Phone_keypads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                System.out.print(getNumber(ch));
            } else if (ch >= 'a' && ch <= 'z') {
                System.out.print(getNumber((char) (ch - ('a' - 'A'))));
            } else {
                System.out.print(str.charAt(i));
            }
        }
    }

    public static int getNumber(char uppercaseLetter) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int position = chars.indexOf(uppercaseLetter);
        if (position >= 0 && position < 3) {
            return 2;
        } else if (position >= 3 && position < 6) {
            return 3;
        } else if (position >= 6 && position < 9) {
            return 4;
        } else if (position >= 9 && position < 12) {
            return 5;
        } else if (position >= 12 && position < 15) {
            return 6;
        } else if (position >= 15 && position < 19) {
            return 7;
        } else if (position >= 19 && position < 22) {
            return 8;
        } else if (position >= 22 && position < 26) {
            return 9;
        }
        return -1;
    }
}
