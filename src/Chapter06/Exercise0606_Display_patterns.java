/**
 * (Display patterns) Write a method to display a pattern as follows:
 * 1
 * 1 2
 * 1 2 3
 * ...
 * 1 2 3 ... n-1 n
 * The method header is
 * public static void displayPattern(int n)
 *
 * Created by Sven on 06/16/19.
 */
package Chapter06;

import java.util.Scanner;

public class Exercise0606_Display_patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();
        displayPattern(number);
    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(j + " ");
            }
            System.out.println();
        }
    }
}
