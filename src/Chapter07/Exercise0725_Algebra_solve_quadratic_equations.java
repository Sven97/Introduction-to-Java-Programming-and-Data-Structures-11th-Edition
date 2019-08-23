/**
 * (Algebra: solve quadratic equations) Write a method for solving a quadratic equation
 * using the following header:
 * public static int solveQuadratic(double[] eqn, double[] roots)
 * The coefficients of a quadratic equation ax2 + bx + c = 0 are passed to the array
 * eqn and the real roots are stored in roots. The method returns the number of real
 * roots. See Programming Exercise 3.1 on how to solve a quadratic equation.
 * Write a program that prompts the user to enter values for a, b, and c and displays
 * the number of real roots and all real roots.
 *
 * Created by Sven on 08/23/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0725_Algebra_solve_quadratic_equations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double[] eqn = new double[3];
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }

        double[] roots = new double[2];
        int numOfRoots = solveQuadratic(eqn, roots);

        System.out.println("Number of roots: " + numOfRoots);
        for (int i = 0; i < numOfRoots; i++) {
            System.out.println("Root " + (i + 1) + " = " + roots[i]);
        }


    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        double discriminant = b * b - 4.0 * a * c;

        if (discriminant > 0.0) {
            roots[0] = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
            roots[1] = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
            return 2;
        } else if (discriminant == 0.0) {
            roots[0] = -b / (2.0 * a);
            return 1;
        }

        return 0;
    }
}
