/**
 * (Conversions between mile and kilometer) Write a class that contains the following
 * two methods:
 * public static double mileToKilometer(double mile)
 * public static double kilometerToMile(double kilometer)
 *
 * The formula for the conversion is:
 * 1 mile = 1.6 kilometers
 * Write a test program that invokes these methods to display the following tables:
 * Miles Kilometers | Kilometers Miles
 * 1 1.609 | 20 12.430
 * 2 3.218 | 25 15.538
 * ...
 * 9 14.481 | 60 37.290
 * 10 16.090 | 65 40.398
 *
 * Created by Sven on 06/16/19.
 */
package Chapter06;

public class Exercise0608_Conversions_between_mile_and_kilometer {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s%-5s%-15s%-15s\n", "Miles", "Kilometers", "|", "Kilometers", "Miles");
        System.out.println("--------------------------------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-15d%-15.3f%-5s%-15d%-15.3f\n", i, mileToKilometer(i), "|", 15 + 5 * i, kilometerToMile(15 + 5 * i));
        }
    }

    /**
     * Convert from Mile to Kilometer
     */
    public static double mileToKilometer(double mile) {
        return mile * 1.6;
    }

    /**
     * Convert from Kilometer to Mile
     */
    public static double kilometerToMile(double kilometer) {
        return kilometer / 1.6;
    }
}
