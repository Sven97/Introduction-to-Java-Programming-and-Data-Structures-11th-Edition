/**
 * (Number of days in a year) Write a method that returns the number of days in a
 * year using the following header:
 * public static int numberOfDaysInAYear(int year)
 * Write a test program that displays the number of days in the years between 2014
 * and 2034.
 *
 * Created by Sven on 07/16/19.
 */
package Chapter06;

public class Exercise0616_Number_of_days_in_a_year {
    public static void main(String[] args) {
        System.out.println("Year    Num of Days");
        System.out.println("-------------------");
        for (int i = 2014; i <= 2034; i++) {
            System.out.println(i + "    " + numberOfDaysInAYear(i));
        }
    }

    public static int numberOfDaysInAYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        }
        return false;
    }
}
