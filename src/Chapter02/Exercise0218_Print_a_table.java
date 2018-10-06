/**
 * (Print a table) Write a program that displays the following table. Calculate the
 * middle point of two points.
 * a         b      Middle Point
 * (0, 0)    (2, 1)    (1.0, 0.5)
 * (1, 4)    (4, 2)    (2.5, 3.0)
 * (2, 7)    (6, 3)    (4.0, 5.0)
 * (3, 9)    (10, 5)   (6.5, 7.0)
 * (4, 11)   (12, 7)   (8.0, 9.0)
 *
 * Created by Sven on 8/17/2018.
 */
package Chapter02;

public class Exercise0218_Print_a_table {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        System.out.println("  a         b      Middle Point");
        x1 = 0;
        y1 = 0;
        x2 = 2;
        y2 = 1;
        System.out.println("(" + x1 + ", " + y1 + ")    " + "(" + x2 + ", " + y2 + ")    " +
                "(" + (x1 + x2) / 2.0 + ", " + (y1 + y2) / 2.0 + ")");
        x1 = 1;
        y1 = 4;
        x2 = 4;
        y2 = 2;
        System.out.println("(" + x1 + ", " + y1 + ")    " + "(" + x2 + ", " + y2 + ")    " +
                "(" + (x1 + x2) / 2.0 + ", " + (y1 + y2) / 2.0 + ")");
        x1 = 2;
        y1 = 7;
        x2 = 6;
        y2 = 3;
        System.out.println("(" + x1 + ", " + y1 + ")    " + "(" + x2 + ", " + y2 + ")    " +
                "(" + (x1 + x2) / 2.0 + ", " + (y1 + y2) / 2.0 + ")");
        x1 = 3;
        y1 = 9;
        x2 = 10;
        y2 = 5;
        System.out.println("(" + x1 + ", " + y1 + ")    " + "(" + x2 + ", " + y2 + ")   " +
                "(" + (x1 + x2) / 2.0 + ", " + (y1 + y2) / 2.0 + ")");
        x1 = 4;
        y1 = 11;
        x2 = 12;
        y2 = 7;
        System.out.println("(" + x1 + ", " + y1 + ")   " + "(" + x2 + ", " + y2 + ")   " +
                "(" + (x1 + x2) / 2.0 + ", " + (y1 + y2) / 2.0 + ")");
    }
}
