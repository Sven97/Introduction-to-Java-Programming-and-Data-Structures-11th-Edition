/**
 * (Compute the perimeter of a triangle) Write a program that reads three edges for a triangle and computes the
 * perimeter if the input is valid. Otherwise, display that the input is invalid. The input is valid if the sum of every
 * pair of two edges is greater than the remaining edge
 *
 * Created by Sven on 8/23/2018.
 */
package Chapter03;

import java.util.Scanner;

public class Exercise0319_Compute_the_perimeter_of_a_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three edges for a triangle (Separated by spaces): ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        if ((edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge2 + edge3 > edge1)) {
            System.out.println("The perimeter is " + (edge1 + edge2 + edge3));
        } else {
            System.out.println("The input is invalid.");
        }
    }
}
