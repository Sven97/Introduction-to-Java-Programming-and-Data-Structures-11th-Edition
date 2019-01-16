/**
 * (Conversion from Cº to Fº) Write a program that displays the following table (note
 * that fahrenheit = celsius * 9/5 + 32):
 *
 * Celsius   Fahrenheit
 * 0               32.0
 * 2               35.6
 * ...
 * 98             208.4
 * 100            212.0
 *
 * Created by Sven on 1/16/2019.
 */
package Chapter05;

public class Exercise0503_Conversion_from_Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        System.out.println("Celsius   Fahrenheit");
        for (int count = 0; count <= 100; count += 2) {
            celsius = count;
            fahrenheit = celsius * 9 / 5 + 32;
            System.out.printf("%-3.0f%17.1f\n", celsius, fahrenheit);
        }
    }
}
