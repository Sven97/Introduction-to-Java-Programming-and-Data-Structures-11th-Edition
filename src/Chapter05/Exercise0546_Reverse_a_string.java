/**
 * (Reverse a string) Write a program that prompts the user to enter a string and
 * displays the string in reverse order.
 *
 * Enter a string: ABCD
 * The reversed string is DCBA
 *
 * Created by Sven on 06/05/19.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0546_Reverse_a_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        String str = input.next();
        String reverse_str = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse_str += str.charAt(i);
        }
        System.out.print("The reversed string is " + reverse_str);

    }
}
