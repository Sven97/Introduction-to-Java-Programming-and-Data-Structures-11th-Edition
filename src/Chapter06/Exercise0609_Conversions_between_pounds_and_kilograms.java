/**
 * (Conversions between pounds and kilograms) Write a class that contains the
 * following two methods:
 * public static double poundToKilogram(double pound)
 * public static double kilogramToPound(double kilogram)
 * The formula for the conversion is:
 * pound=0.453*kilogram
 * kilogram=2.204*pound
 * Write a test program that invokes these methods to display the following tables:
 * Kilograms Pounds|Pounds Kilograms
 * 1 2.2|20 9.09
 * 3 6.6|25 11.36
 * ...
 * 197 433.4|510 231.82
 * 199 437.8|515 234.09
 *
 * Created by Sven on 06/16/19.
 */
package Chapter06;

public class Exercise0609_Conversions_between_pounds_and_kilograms {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s%-5s%-15s%-15s\n", "Kilograms", "Pounds", "|", "Pounds", "Kilograms");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i <= 99; i++) {
            System.out.printf("%-15d%-15.1f%-5s%-15d%-15.2f\n", 1 + i * 2, kilogramToPound(1 + i * 2), "|", 20 + 5 * i, poundToKilogram(20 + 5 * i));
        }
    }

    /**
     * Convert from pounds to kilograms
     */
    public static double poundToKilogram(double pound) {
        return 0.453 * pound;
    }

    /**
     * Convert from kilograms to pounds
     */
    public static double kilogramToPound(double kilogram) {
        return 2.204 * kilogram;
    }
}
