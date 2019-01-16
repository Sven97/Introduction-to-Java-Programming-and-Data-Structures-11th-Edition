/**
 * (Conversion from square meter to ping) Write a program that displays the following
 * two tables side by side (note that 1 ping = 3.305 square meters):
 * Ping   Square meter | Square meter   Ping
 * 10           33.050 | 30            9.077
 * 15           49.575 | 35           10.590
 * ...
 * 75          247.875 | 95           28.744
 * 80          264.400 | 100          30.257
 *
 * Created by Sven on 1/16/2019.
 */
package Chapter05;

public class Exercise0506_Conversion_from_square_meter_to_ping {
    public static void main(String[] args) {
        double ping1, squareMeter1, ping2, squareMeter2;
        System.out.println("Celsius   Fahrenheit | Fahrenheit   Celsius");
        for (int count = 0; count <= 14; count++) {
            ping1 = count * 5 + 10;
            squareMeter1 = 3.305 * ping1;
            squareMeter2 = count * 5 + 30;
            ping2 = squareMeter2 / 3.305;
            System.out.printf("%-3.0f%17.3f | %-3.0f%17.3f\n", ping1, squareMeter1, squareMeter2, ping2);
        }
    }
}
