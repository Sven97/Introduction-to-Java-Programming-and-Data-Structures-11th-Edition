/**
 * (Random point) Write a program that displays a random coordinate in a rectangle. The rectangle is centered at (0, 0)
 * with width 100 and height 200.
 *
 * Created by Sven on 8/23/2018.
 */
package Chapter03;

public class Exercise0316_Random_point {
    public static void main(String[] args) {
        double x = Math.random() * 100 - 50;
        double y = Math.random() * 200 - 100;

        System.out.println("The randomly generated point: (" + x + ", " + y + ")");
    }
}
