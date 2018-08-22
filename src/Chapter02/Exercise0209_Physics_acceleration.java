/**
 * (Physics: acceleration) Average acceleration is defined as the change of velocity divided by the time taken to make
 * the change, as shown in the following formula:
 * a = (v1 - v0) / t
 * Write a program that prompts the user to enter the starting velocity v0 in meters/second, the ending velocity v1 in
 * meters/second, and the time span t in seconds, and displays the average acceleration.
 *
 * Here is a sample run:
 * Enter v0, v1, and t: 5.5 50.9 4.5
 * The average acceleration is 10.0889
 *
 * Created by Sven on 8/17/2018.
 */
package Chapter02;

import java.util.Scanner;

public class Exercise0209_Physics_acceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        System.out.println("The average acceleration is " + (v1 - v0) / t);
    }
}
