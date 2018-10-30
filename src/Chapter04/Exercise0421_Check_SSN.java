/**
 * (Check SSN) Write a program that prompts the user to enter a Social Security
 * number in the format DDD-DD-DDDD, where D is a digit. Your program should
 * check whether the input is valid.
 *
 * Here are sample runs:
 * Enter a SSN: 232-23-5435
 * 232−23−5435 is a valid social security number
 * Enter a SSN: 23-23-5435
 * 23−23−5435 is an invalid social security number
 *
 * Created by Sven on 10/30/2018.
 */
package Chapter04;

import java.util.Scanner;

public class Exercise0421_Check_SSN {
    public static void main(String[] args) {
        // The code can be optimized using "loop" in Chapter 5
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String string = input.nextLine();
        boolean isValid = true;


        if ((Character.isDigit(string.charAt(0)) == false) || (Character.isDigit(string.charAt(1)) == false) ||
                (Character.isDigit(string.charAt(2)) == false) || (Character.isDigit(string.charAt(4)) == false) ||
                (Character.isDigit(string.charAt(5)) == false) || (Character.isDigit(string.charAt(7)) == false) ||
                (Character.isDigit(string.charAt(8)) == false) || (Character.isDigit(string.charAt(9)) == false) ||
                (Character.isDigit(string.charAt(10)) == false) || (string.length() > 11) ||
                (string.charAt(3) != '-') || (string.charAt(6) != '-')) {
            isValid = false;
        }

        // Method using loop
//        if (string.length() > 11) {
//            isValid = false;
//        }
//        for (int i = 0; i < string.length(); i++) {
//            if ((i <= 2) || (i >= 4 && i <= 5) || (i >= 7)) {
//                if (Character.isDigit(string.charAt(i)) == false) {
//                    isValid = false;
//                    break;
//                }
//            }
//            if ((i == 3) || (i == 6)) {
//                if (string.charAt(i) != '-') {
//                    isValid = false;
//                    break;
//                }
//            }
//        }

        System.out.println(isValid ? (string + " is a valid social security number") : (string + " is a invalid social security number"));
    }
}
