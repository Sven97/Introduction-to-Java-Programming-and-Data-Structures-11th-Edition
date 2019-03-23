/**
 * (Display the first days of each month) Write a program that prompts the user to
 * enter the year and first day of the year, then displays the first day of each month in
 * the year. For example, if the user entered the year 2013, and 2 for Tuesday, January
 * 1, 2013, your program should display the following output:
 * January 1, 2013 is Tuesday
 * ...
 * December 1, 2013 is Sunday
 *
 * Created by Sven on 3/23/2019.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0528_Display_the_first_days_of_each_month {
    public static void main(String[] strings) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of the year: ");
        int firstDay = input.nextInt();

        int numberOfDaysInMonth = 0;
        for (int month = 1; month <= 12; month++) {
            switch (month) {
                case 1:
                    System.out.print("January 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    System.out.println(firstDayToStr(firstDay));
                    break;
                case 2:
                    System.out.print("February 1, " + year + " is ");
                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                        numberOfDaysInMonth = 29;
                    else
                        numberOfDaysInMonth = 28;
                    System.out.println(firstDayToStr(firstDay));
                    break;
                case 3:
                    System.out.print("March 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    System.out.println(firstDayToStr(firstDay));
                    break;
                case 4:
                    System.out.print("April 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    System.out.println(firstDayToStr(firstDay));
                    break;
                case 5:
                    System.out.print("May 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    System.out.println(firstDayToStr(firstDay));
                    break;
                case 6:
                    System.out.print("June 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    System.out.println(firstDayToStr(firstDay));
                    break;
                case 7:
                    System.out.print("July 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    System.out.println(firstDayToStr(firstDay));
                    break;
                case 8:
                    System.out.print("August 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    System.out.println(firstDayToStr(firstDay));
                    break;
                case 9:
                    System.out.print("September 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    System.out.println(firstDayToStr(firstDay));
                    break;
                case 10:
                    System.out.print("October 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    System.out.println(firstDayToStr(firstDay));
                    break;
                case 11:
                    System.out.print("November 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    System.out.println(firstDayToStr(firstDay));
                    break;
                case 12:
                    System.out.print("December 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    System.out.println(firstDayToStr(firstDay));
                    break;
            }

            // Get the start day for the next month
            firstDay = (firstDay + numberOfDaysInMonth) % 7;
        }
    }

    public static String firstDayToStr(int firstDay) {
        switch (firstDay) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return null;
        }
    }
}
