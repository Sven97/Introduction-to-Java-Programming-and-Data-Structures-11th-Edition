/**
 * (Count the number of vowels in a string) Write a program that prompts the user to enter
 * a string, and counts and displays the number of both lowercase and uppercase vowels
 * in the string.
 *
 * Created by Sven on 08/22/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0722_Count_the_number_of_vowels_in_a_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        char[] chars = str.toCharArray();

        int vowelsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U' ||
                    chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
                vowelsCount++;
            }
        }
        System.out.println("The number of vowels in the string is " + vowelsCount);

    }
}
