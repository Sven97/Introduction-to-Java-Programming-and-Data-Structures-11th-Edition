/**
 * (Conversion from Cº to Fº and Fº to Cº) Write a program that displays the following
 * two tables side by side:
 * Celsius   Fahrenheit | Fahrenheit   Celsius
 * 0             32.000 | 20            −6.667
 * 2             35.600 | 25            −3.889
 * ...
 * 98           208.400 | 265          129.444
 * 100          212.000 | 270          132.222
 *
 * Created by Sven on 1/16/2019.
 */
package Chapter05;

public class Exercise0505_Conversion_from_C_to_F_and_F_to_C {
    public static void main(String[] args) {
        double celsius1, fahrenheit1, celsius2, fahrenheit2;
        System.out.println("Celsius   Fahrenheit | Fahrenheit   Celsius");
        for (int count = 0; count <= 100; count += 2) {
            celsius1 = count;
            fahrenheit2 = 20 + count / 2 * 5;
            fahrenheit1 = celsius1 * 9 / 5 + 32;
            celsius2 = (fahrenheit2 - 32) / 9 * 5;
            System.out.printf("%-3.0f%17.3f | %-3.0f%17.3f\n", celsius1, fahrenheit1, fahrenheit2, celsius2);
        }
    }
}
