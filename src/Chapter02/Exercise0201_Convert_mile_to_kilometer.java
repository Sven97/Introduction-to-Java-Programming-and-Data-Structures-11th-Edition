/**
 * ((Convert mile to kilometer) Write a program that reads a mile in a double value
 * from the console, converts it to kilometers, and displays the result. The formula
 * for the conversion is as follows:
 * 1 mile = 1.6 kilometers
 *
 * Here is a sample run:
 * Enter miles: 96
 * 96 miles is 153.6 kilometers
 *
 * Created by Sven on 8/17/2018.
 */
package Chapter02;

import java.util.Scanner;

public class Exercise0201_Convert_mile_to_kilometer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter miles: ");
        double miles = input.nextDouble();
        double kilometers = miles * 1.6;
        System.out.println(miles + " miles is " + kilometers + " kilometers");
    }
}
