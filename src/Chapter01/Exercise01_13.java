/**
 * (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following 2 * 2 system of linear
 * equation:
 * ax + by = e  cx + dy = f
 * x = (ed-bf)/(ad-bc)  y = (af-ec)/(ad-bc)
 * Write a program that solves the following equation and displays the value for x and y:
 * 3.4x + 50.2y = 44.5  2.1x + .55y = 5.9
 *
 * Created by Sven on 08/16/18.
 */
package Chapter01;

public class Exercise01_13 {
    public static void main(String[] args) {
        double a = 3.4;
        double b = 50.2;
        double e = 44.5;
        double c = 2.1;
        double d = 0.55;
        double f = 5.9;

        System.out.println("The solution is: ");
        System.out.println("x = " + (e * d - b * f) / (a * d - b * c));
        System.out.println("y = " + (a * f - e * c) / (a * d - b * c));
    }
}
