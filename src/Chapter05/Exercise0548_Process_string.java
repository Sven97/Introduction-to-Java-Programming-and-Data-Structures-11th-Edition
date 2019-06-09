/**
 * (Process string) Write a program that prompts the user to enter a string and displays
 * the characters at even positions. Here is a sample run:
 *
 * Enter a string: Beijing Chicago
 * ejnhcg
 *
 * Created by Sven on 06/10/19.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0548_Process_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        for (int i = 1; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
    }
}
