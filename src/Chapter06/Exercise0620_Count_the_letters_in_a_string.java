/**
 * (Count the letters in a string) Write a method that counts the number of letters in
 * a string using the following header:
 * public static int countLetters(String s)
 * Write a test program that prompts the user to enter a string and displays the number
 * of letters in the string.
 *
 * Created by Sven on 07/16/19.
 */
package Chapter06;

import java.util.Scanner;

public class Exercise0620_Count_the_letters_in_a_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.println("The number of letters: " + countLetters(str));
    }

    public static int countLetters(String s) {
        int letterCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                letterCount++;
            }
        }
        return letterCount;
    }
}
