/**
 * (Conversion from inch to centimeter) Write a program that displays the following
 * table (note that 1 inch is 2.54 centimeters):
 * Inches   Centimetres
 * 1        2.54
 * 2        5.08
 * ...
 * 9        22.86
 * 10       25.4
 *
 * Created by Sven on 1/16/2019.
 */
package Chapter05;

public class Exercise0504_Conversion_from_inch_to_centimeter {
    public static void main(String[] args) {
        int inches = 0;
        double centimeters = 0.0;
        System.out.println("Inches   Centimetres");
        for (; inches <= 10; inches++) {
            centimeters = (double) inches * 2.54;
            System.out.printf("%-9d%.2f\n", inches, centimeters);
        }
    }
}
