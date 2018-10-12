/**
 * (Geometry: area of a hexagon) The area of a hexagon can be computed using the
 * following formula (s is the length of a side):
 * Area = (6 * s^2) / (4 * tan(PI/6))
 * Write a program that prompts the user to enter the side of a hexagon and displays
 * its area.
 *
 * Here is a sample run:
 * Enter the side: 5.5
 * The area of the hexagon is 78.59
 *
 * Created by Sven on 10/6/2018.
 */
package Chapter04;

import java.util.Scanner;

public class Exercise0404_Geometry_area_of_a_hexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.printf("The area of the hexagon is %.2f", area);
    }
}
