/**
 * (Even or odd number) Write a program that prompts the user to enter an integer and
 * displays whether the integer is an odd number or not.
 *
 * Here are the sample runs:
 * Enter an integer: 200
 * 200 is even number
 * Enter an integer: 211
 * 211 is odd number
 *
 * Created by Sven on 9/6/2018.
 */
package Chapter03;

import java.util.Scanner;

public class Exercise0335_Even_or_odd_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }
}
