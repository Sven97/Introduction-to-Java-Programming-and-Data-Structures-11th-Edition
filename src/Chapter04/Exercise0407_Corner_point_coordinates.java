/**
 * (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point
 * at the 0 o’clock position, as shown in Figure 4.4c. Write a program that prompts
 * the user to enter the radius of the bounding circle of a pentagon and displays the
 * coordinates of the five corner points on the pentagon from p1 to p5 in this order.
 * Use console format to display two digits after the decimal point.
 *
 * Here is a sample run:
 * Enter the radius of the bounding circle: 100.52
 * The coordinates of five points on the pentagon are
 * (95.60, 31.06)
 * (0.00, 100.52)
 * (−95.60, 31.06)
 * (−58.08, −81.32)
 * (59.08, −81.32)
 *
 * Created by Sven on 10/12/2018.
 */
package Chapter04;

import java.util.Scanner;

public class Exercise0407_Corner_point_coordinates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        System.out.println("The coordinates of five points on the pentagon are");
        double p1x = radius * Math.cos(Math.toRadians(18));
        double p1y = radius * Math.sin(Math.toRadians(18));
        System.out.printf("(%.2f, %.2f)\n", p1x, p1y);

        double p2x = radius * Math.cos(Math.toRadians(90));
        double p2y = radius * Math.sin(Math.toRadians(90));
        System.out.printf("(%.2f, %.2f)\n", p2x, p2y);

        double p3x = radius * Math.cos(Math.toRadians(162));
        double p3y = radius * Math.sin(Math.toRadians(162));
        System.out.printf("(%.2f, %.2f)\n", p3x, p3y);

        double p4x = radius * Math.cos(Math.toRadians(234));
        double p4y = radius * Math.sin(Math.toRadians(234));
        System.out.printf("(%.2f, %.2f)\n", p4x, p4y);

        double p5x = radius * Math.cos(Math.toRadians(306));
        double p5y = radius * Math.sin(Math.toRadians(306));
        System.out.printf("(%.2f, %.2f)\n", p5x, p5y);
    }
}
