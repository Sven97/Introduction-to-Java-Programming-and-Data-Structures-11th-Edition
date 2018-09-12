/**
 * (Geometry: area of a pentagon) Write a program that prompts the user to enter the length from the center of a
 * pentagon to a vertex and computes the area of the pentagon, as shown in the following figure.
 * The formula for computing the area of a pentagon is Area = (5 * s^2) / (4 * tan(Pi / 5)), where s is the length of a
 * side. The side can be computed using the formula s = 2r sin(Pi / 5), where r is the length from the center of a
 * pentagon to a vertex. Round up two digits after the decimal point.
 *
 * Here is a sample run:
 * Enter the length from the center to a vertex: 5.5
 * The area of the pentagon is 71.92
 *
 * Created by Sven on 9/6/2018.
 */
package Chapter04;

import java.util.Scanner;

public class Exercise0401_Geometry_area_of_a_pentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();
        double s = 2 * r * Math.sin(Math.PI / 5);
        double areaOfPentagon = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("The area of the pentagon is %.2f",areaOfPentagon);
    }
}
