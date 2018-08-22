/**
 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off speed v, you can compute the
 * minimum runway length needed for an airplane to take off using the following formula:
 * length = v^2 / 2a
 * Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a in meters/second
 * squared (m/s2), and displays the minimum runway length.
 *
 * Here is a sample run:
 * Enter speed and acceleration: 60 3.5
 * The minimum runway length for this airplane is 514.286
 *
 * Created by Sven on 8/17/2018.
 */
package Chapter02;

import java.util.Scanner;

public class Exercise0212_Physics_finding_runway_length {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double length = speed * speed / (2 * acceleration);
        System.out.println("The minimum runway length for this airplane is " + length);
    }
}
