/**
 * (Display calendars) Write a program that prompts the user to enter the year and
 * first day of the year and displays the calendar table for the year on the console. For
 * example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
 * your program should display the calendar for each month in the year, as follows:
 *         January 2013
 * -----------------------------
 *  Sun Mon Tue Wed Thu Fri Sat
 *            1   2   3   4   5
 *    6   7   8   9  10  11  12
 *   13  14  15  16  17  18  19
 *   20  21  22  23  24  25  26
 *   27  28  29  30  31
 *              ...
 *          December 2013
 * -----------------------------
 *  Sun Mon Tue Wed Thu Fri Sat
 *    1   2   3   4   5   6   7
 *    8   9  10  11  12  13  14
 *   15  16  17  18  19  20  21
 *   22  23  24  25  26  27  28
 *   29  30  31
 *
 * Created by Sven on 3/23/2019.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0529_Display_Calendars {
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year: ");
        int startDay = input.nextInt();

        int numberOfDaysInMonth = 0;
        for (int month = 1; month <= 12; month++)
        {
            System.out.print("        ");
            switch (month)
            {
                case 1:
                    System.out.println("January " + year);
                    numberOfDaysInMonth = 31;
                    break;
                case 2:
                    System.out.println("February " + year);
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        numberOfDaysInMonth = 29;
                    } else {
                        numberOfDaysInMonth = 28;
                    }
                    break;
                case 3:
                    System.out.println("March " + year);
                    numberOfDaysInMonth = 31;
                    break;
                case 4:
                    System.out.println("April " + year);
                    numberOfDaysInMonth = 30;
                    break;
                case 5:
                    System.out.println("May " + year);
                    numberOfDaysInMonth = 31;
                    break;
                case 6:
                    System.out.println("June " + year);
                    numberOfDaysInMonth = 30;
                    break;
                case 7:
                    System.out.println("July " + year);
                    numberOfDaysInMonth = 31;
                    break;
                case 8:
                    System.out.println("August " + year);
                    numberOfDaysInMonth = 31;
                    break;
                case 9:
                    System.out.println("September " + year);
                    numberOfDaysInMonth = 30;
                    break;
                case 10:
                    System.out.println("October " + year);
                    numberOfDaysInMonth = 31;
                    break;
                case 11:
                    System.out.println("November " + year);
                    numberOfDaysInMonth = 30;
                    break;
                case 12:
                    System.out.println("December " + year);
                    numberOfDaysInMonth = 31;
            }
            System.out.println("-----------------------------");
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");


            for (int i = 0; i < startDay; i++) {
                System.out.print("    ");
            }
            for (int i = 1; i <= numberOfDaysInMonth; i++)
            {
                if (i < 10) {
                    System.out.print("   " + i);
                } else {
                    System.out.print("  " + i);
                }
                if ((i + startDay) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println("");


            startDay = (startDay + numberOfDaysInMonth) % 7;
        }
    }
}
