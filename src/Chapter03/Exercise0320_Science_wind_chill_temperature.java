/**
 * (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula to
 * compute the wind-chill temperature. The formula is valid for temperatures in the
 * range between -58℉ and 41℉ and wind speed greater than or equal to 2. Write
 * a program that prompts the user to enter a temperature and a wind speed. The program
 * displays the wind-chill temperature if the input is valid; otherwise, it displays
 * a message indicating whether the temperature and/or wind speed is invalid.
 *
 * Created by Sven on 8/23/2018.
 */
package Chapter03;

import java.util.Scanner;

public class Exercise0320_Science_wind_chill_temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double ta = input.nextDouble();
        if (ta < -58 || ta > 41) {
            System.out.println("Invalid input of the temperature.");
            System.exit(1);
        }
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double v = input.nextDouble();
        if (v < 2) {
            System.out.println("Invalid input of the wind speed.");
            System.exit(1);
        }

        double twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);
        System.out.println("The wind chill index is " + twc);
    }
}
