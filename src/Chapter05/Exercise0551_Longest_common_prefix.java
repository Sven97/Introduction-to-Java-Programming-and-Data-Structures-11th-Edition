/**
 * (Longest common prefix) Write a program that prompts the user to enter two
 * strings and displays the largest common prefix of the two strings. Here are some
 * sample runs:
 *
 * Enter the first string: Welcome to C++
 * Enter the second string: Welcome to programming
 * The common prefix is Welcome to
 *
 * Enter the first string: Atlanta
 * Enter the second string: Macon
 * Atlanta and Macon have no common prefix
 *
 * Created by Sven on 06/10/19.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0551_Longest_common_prefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstStr = input.nextLine();

        System.out.print("Enter the second string: ");
        String secondStr = input.nextLine();

        String commonPrefix = "";

        int minLen = (firstStr.length() <= secondStr.length()) ? firstStr.length() : secondStr.length();
        for (int i = 0; i < minLen; i++) {
            if (firstStr.charAt(i) == secondStr.charAt(i)) {
                commonPrefix += firstStr.charAt(i);
            } else {
                break;
            }
        }

        if (commonPrefix.length() == 0) {
            System.out.println(firstStr + " and " + secondStr + " have no common prefix");
        } else {
            System.out.println("The common prefix is " + commonPrefix);
        }
    }
}
