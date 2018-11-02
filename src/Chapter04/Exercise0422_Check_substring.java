/**
 * (Check substring) Write a program that prompts the user to enter two strings, and
 * reports whether the second string is a substring of the first string.
 *
 * Enter string s1: ABCD
 * Enter string s2: BC
 * BC is a substring of ABCD
 * Enter string s1: ABCD
 * Enter string s2: BDC
 * BDC is not a substring of ABCD
 *
 * Created by Sven on 11/2/2018.
 */
package Chapter04;

import java.util.Scanner;

public class Exercise0422_Check_substring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String str1 = input.nextLine();
        System.out.print("Enter string s2: ");
        String str2 = input.nextLine();

        System.out.println(str1.contains(str2) ? (str2 + " is a substring of " + str1) : (str2 + " is not a substring of " + str1));
    }
}
