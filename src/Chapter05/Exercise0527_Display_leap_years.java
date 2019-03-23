/**
 * (Display leap years) Write a program that displays all the leap years, ten per line,
 * from 2014 to 2114, separated by exactly one space. Also display the number of
 * leap years in this period.
 *
 * Created by Sven on 3/23/2019.
 */
package Chapter05;

public class Exercise0527_Display_leap_years {
    public static void main(String[] args) {
        System.out.println("The leap year between 2014 and 2114");
        for (int i = 2014, counter = 1; i < 2114; i++) {
            if ((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0))) {
                System.out.print(i + " ");
                if (counter % 10 == 0) {
                    System.out.println();
                }
                counter++;
            }
        }
    }
}
