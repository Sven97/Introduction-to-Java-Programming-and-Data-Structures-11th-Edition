/**
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the side of a hexagon and displays its
 * area. The formula for computing the area of a hexagon is
 * Area = (3sqrt(3)/ 2) * s^2
 * where s is the length of a side.
 *
 * Here is a sample run:
 * Enter the side: 5.5
 * The area of the hexagon is 78.5895
 *
 * Created by Sven on 8/17/2018.
 */
package Chapter02;

import java.util.Scanner;

public class Exercise0216_Geometry_area_of_a_hexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = (3 * Math.pow(3, 0.5) / 2) * Math.pow(side, 2);
        System.out.println("The area of the hexagon is " + area);
    }
}
