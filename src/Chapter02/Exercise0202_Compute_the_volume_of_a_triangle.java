/**
 * (Compute the volume of a triangle) Write a program that reads in the length of
 * sides of an equilateral triangle and computes the area and volume using the following
 * formulas:
 * area = sqrt(3) / 4 *(length of sides)^2
 * volume = area * length
 *
 * Here is a sample run:
 * Enter length of the sides and height of the Equilateral
 * triangle: 3.5
 * The area is 3.89 [Should be 5.30?]
 * The volume of the Triangular prism is 19.48 [Should be 18.56?]
 *
 * Created by Sven on 8/17/2018.
 */
package Chapter02;

import java.util.Scanner;

public class Exercise0202_Compute_the_volume_of_a_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        double sideLength = input.nextDouble();

        double area = Math.pow(3, 0.5) / 4 * Math.pow(sideLength, 2);
        double volume = area * sideLength;
        System.out.println("The area is " + area);
        System.out.println("The volume of the Triangular prism is " + volume);
    }

}
