/**
 * (Convert meters into feet) Write a program that reads a number in meters, converts
 * it to feet, and displays the result. One meter is 3.2786 feet.
 *
 * Here is a sample run:
 * Enter a value for meter: 10
 * 10.0 meters is 32.786 feet
 *
 * Created by Sven on 8/17/2018.
 */
package Chapter02;

import java.util.Scanner;

public class Exercise0203_Convert_feet_into_meters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for meter: ");
        double meters = input.nextDouble();

        double feet = meters * 3.2786;
        System.out.println(meters + " meters is " + feet + " feet");
    }
}
