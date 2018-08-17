/**
 * (Convert feet into meters) Write a program that reads a number in feet, converts it to meters, and displays the
 * result. One foot is 0.305 meter.
 *
 * Here is a sample run:
 * Enter a value for feet: 16.5
 * 16.5 feet is 5.0325 meters
 *
 * Created by Sven on 08/16/18.
 */
package Chapter02;

import java.util.Scanner;

public class Exercise0203_Convert_feet_into_meters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        double meters = feet * 0.305;
        System.out.println(feet + " feet is " + meters + " meters");
    }
}
