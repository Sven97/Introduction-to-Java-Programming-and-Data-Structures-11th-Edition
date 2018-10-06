/**
 * (Convert square meter into ping) Write a program that converts square meter into ping.
 * The program prompts the user to enter a number in square meter, converts it to ping,
 * and displays the result. One square meter is 0.3025 ping.
 *
 * Here is a sample run:
 * Enter a number in square meters: 50
 * 50.0 square meters is 15.125 pings
 *
 * Created by Sven on 8/17/2018.
 */
package Chapter02;

import java.util.Scanner;

public class Exercise0204_Convert_pounds_into_kilograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in square meters: ");
        double squareMeters = input.nextDouble();

        double pings = squareMeters * 0.3025;
        System.out.println(squareMeters + " square meters is " + pings + " pings");
    }
}
