/**
 * (Triangles) Implement the following two methods:
 * public static boolean isValid(
 * double side1,double side2,double side3)
 * public static double area(
 * double side1,double side2,double side3)
 * Write a test program that reads three sides for a triangle and uses the isValid
 * method to test if the input is valid and uses the area method to obtain the area.
 * The program displays the area if the input is valid.Otherwise,it displays that
 * the input is invalid.The formula for computing the area of a triangle is given in
 * Programming Exercise2.19.
 *
 * Created by Sven on 07/16/19.
 */
package Chapter06;

import java.util.Scanner;

public class Exercise0619_Triangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = input.nextDouble();

        if (isValid(side1, side2, side3)) {
            System.out.println("The area of this triangle is " + area(side1, side2, side3));
        } else {
            System.out.println("Invalid triangle");
        }
    }

    /**
     * Return true if the sum of every two sides is greater than the third side.
     */
    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1);
    }

    /**
     * Return the area of the triangle.
     */
    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }

}
