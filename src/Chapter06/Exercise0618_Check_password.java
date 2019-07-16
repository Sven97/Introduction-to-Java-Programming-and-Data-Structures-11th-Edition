/**
 * (Check password) Some websites impose certain rules for passwords. Write a
 * method that checks whether a string is a valid password. Suppose the password
 * rules are as follows:
 * ■ A password must have at least ten characters.
 * ■ A password consists of only letters and digits.
 * ■ A password must contain at least three digits.
 * Write a program that prompts the user to enter a password and displays Valid
 * Password if the rules are followed or Invalid Password otherwise.
 *
 * Created by Sven on 07/16/19.
 */
package Chapter06;

import java.util.Scanner;

public class Exercise0618_Check_password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = input.nextLine();
        System.out.println(isValid(password) ? "Valid Password" : "Invalid Password");
    }

    public static boolean isValid(String password) {
        // A password must have at least ten characters.
        if (password.length() < 10) {
            System.out.println("A password must have at least ten characters.");
            return false;
        }

        int letterCount = 0, digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            // -1: Neither letters nor Digits 0: Letters 1: Digits
            switch (isLettersOrDigits(password.charAt(i))) {
                case -1:
                    // A password consists of only letters and digits
                    System.out.println("A password consists of only letters and digits.");
                    return false;
                case 0:
                    letterCount++;
                    break;
                case 1:
                    digitCount++;
                    break;
            }
        }

        // A password must contain at least three digits.
        if (digitCount < 3) {
            System.out.println("A password must contain at least three digits.");
            return false;
        }

        // Valid password
        return true;
    }

    // -1 Neither letters nor Digits
    //  0 Letters
    //  1 Digits
    public static int isLettersOrDigits(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return 0;
        }
        if (ch >= '0' && ch <= '9') {
            return 1;
        }
        return -1;
    }
}
