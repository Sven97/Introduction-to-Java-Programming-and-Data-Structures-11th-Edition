/**
 * ((Geometry: point in a rectangle?) Write a program that prompts the user to enter a
 * point (x, y) and checks whether the point is within the rectangle centred at (1, 1)
 * with width 10 and height 5. For example, (2, 2) is inside the rectangle and (6, 4)
 * is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the rectangle
 * if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its vertical
 * distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to cover all
 * cases.) Here are two sample runs.
 *
 * Here are two sample runs.
 * Enter a point with two coordinates: 2 2
 * Point (2.0, 2.0) is in the rectangle
 * Enter a point with two coordinates: 6 4
 * Point (6.0, 4.0) is not in the rectangle
 *
 * Created by Sven on 8/25/2018.
 */
package Chapter03;

import java.util.Scanner;

public class Exercise0323_Geometry_point_in_a_rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        boolean inRectangle = false;

        System.out.print("Point (" + x + ", " + y + ") is ");
        if (x <= 10 / 2 && x >= -10 / 2) {
            if (y <= 5 / 2 && y >= -5 / 2) {
                inRectangle = true;
            }
        }
        System.out.println(inRectangle ? "in the rectangle." : "not in the rectangle.");
    }
}
