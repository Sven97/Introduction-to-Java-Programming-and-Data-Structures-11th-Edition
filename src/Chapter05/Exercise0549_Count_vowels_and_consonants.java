/**
 * (Count vowels and consonants) Assume that the letters A, E, I, O, and U are vowels.
 * Write a program that prompts the user to enter a string, and displays the number of
 * vowels and consonants in the string.
 *
 * Enter a string: Programming is fun
 * The number of vowels is 5
 * The number of consonants is 11
 *
 * Created by Sven on 06/10/19.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0549_Count_vowels_and_consonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int numOfVow = 0, numOfCon = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                    ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                numOfVow++;
            } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                numOfCon++;
            }
        }
        System.out.println("The number of vowels is " + numOfVow);
        System.out.println("The number of consonants is " + numOfCon);
    }
}

