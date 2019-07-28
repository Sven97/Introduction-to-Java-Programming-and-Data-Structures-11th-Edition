/**
 * (Geometry: area of a pentagon) The area of a pentagon can be computed using
 * the following formula:
 * Area = (5 x s^2) / (4 x tan(Pi /5))
 * Write a method that returns the area of a pentagon using the following header:
 * public static double area(double side)
 * Write a main method that prompts the user to enter the side of a pentagon and
 * displays its area. Here is a sample run:
 * Enter the side: 5.5
 * The area of the pentagon is 52.04444136781625
 *
 * Created by Sven on 07/27/19.
 */
package Chapter06;

import java.util.Scanner;

public class Exercise0635_Geometry_area_of_a_pentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        System.out.println("The area of the pentagon is " + area(side));
    }

    public static double area(double side) {
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }
}
