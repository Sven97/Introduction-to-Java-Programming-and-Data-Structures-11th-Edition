/**
 * (Geometry: two rectangles) Write a program that prompts the user to enter the center x-, y-coordinates, width, and
 * height of two rectangles and determines whether the second rectangle is inside the first or overlaps with the first,
 * as shown in Figure 3.9. Test your program to cover all cases.
 *
 * Here are the sample runs:
 * Enter r1's center x-, y-coordinates, width, and height: 2.5 4 2.5 43
 * Enter r2's center x-, y-coordinates, width, and height: 1.5 5 0.5 3
 * r2 is inside r1
 * Enter r1's center x-, y-coordinates, width, and height: 1 2 3 5.5
 * Enter r2's center x-, y-coordinates, width, and height: 3 4 4.5 5
 * r2 overlaps r1
 * Enter r1's center x-, y-coordinates, width, and height: 1 2 3 3
 * Enter r2's center x-, y-coordinates, width, and height: 40 45 3 2
 * r2 does not overlap r1
 *
 * Created by Sven on 8/25/2018.
 */
package Chapter03;

import java.util.Scanner;

public class Exercise0328_Geometry_two_rectangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();

        double xDistance = Math.abs(x1 - x2);
        double yDistance = Math.abs(y1 - y2);

        boolean isInside = ((width1 - width2) / 2 >= xDistance) && ((height1 - height2) / 2 >= yDistance);
        boolean isOverlap = ((width1 + width2) / 2 >= xDistance) && ((height1 + height2) / 2 >= yDistance);

        if (isInside) {
            System.out.println("r2 is inside r1");
        } else if (isOverlap) {
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2 does not overlap r1");
        }
    }
}
