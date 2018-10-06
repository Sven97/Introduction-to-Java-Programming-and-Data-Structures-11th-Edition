/**
 * (Science: wind-chill temperature) How cold is it outside? The temperature alone
 * is not enough to provide the answer. Other factors including wind speed, relative
 * humidity, and sunshine play important roles in determining coldness outside. In 2001,
 * the National Weather Service (NWS) implemented the new wind-chill temperature
 * to measure the coldness using temperature and wind speed. The formula is
 * twc = 35.74 + 0.6215ta - 35.75v^0.16 + 0.4275tav^0.16
 * where ta is the outside temperature measured in degrees Fahrenheit, v is the speed
 * measured in miles per hour, and twc is the wind-chill temperature. The formula
 * cannot be used for wind speeds below 2 mph or temperatures below -58ºF or
 * above 41ºF.
 * Write a program that prompts the user to enter a temperature between -58ºF
 * and 41ºF and a wind speed greater than or equal to 2 then displays the wind-chill
 * temperature. Use Math.pow(a, b) to compute v^0.16.
 *
 * Here is a sample run:
 * Enter the temperature in Fahrenheit between -58ºF and 41ºF: 5.3
 * Enter the wind speed (>=2) in miles per hour: 6
 * The wind chill index is -5.56707
 *
 * Created by Sven on 8/17/2018.
 */
package Chapter02;

import java.util.Scanner;

public class Exercise0217_Science_wind_chill_temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58ºF and 41ºF: ");
        double ta = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double v = input.nextDouble();

        double twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);
        System.out.println("The wind chill index is " + twc);
    }
}
