/**
 * (Vowel or consonant?) Write a program that prompts the user to enter a letter and
 * check whether the letter is a vowel or consonant. For a nonletter input, display
 * invalid input.
 *
 * Here is a sample run:
 * Enter a letter: B
 * B is a consonant
 * Enter a letter: a
 * a
 * Enter a letter: #
 * # is an invalid input
 *
 * Created by Sven on 10/26/2018.
 */
package Chapter04;

import java.util.Scanner;

public class Exercise0413_Vowel_or_consonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char character = input.next().charAt(0);

        String chars = "aeiouAEIOUbcdfghjklmpqrstvwxyzBCDFGHJKLMPQRSTVWXY";
        int position = chars.indexOf(character);
        if (position == -1) {
            System.out.println(character + " is an invalid input");
        } else {
            System.out.print(character);
            System.out.println((position <= 9) ? " is a vowel" : " is a consonant");
        }
    }
}
