/**
 * (Find the number of days in a month) Write a program that prompts the user to enter
 * the month and year and displays the number of days in the month. For example, if
 * the user entered month 2 and year 2012, the program should display that February
 * 2012 has 29 days. If the user entered month 3 and year 2015, the program should
 * display that March 2015 has 31 days.
 *
 * Created by Sven on 8/22/2018.
 */
package Chapter03;

import java.util.Scanner;

public class Exercise0311_Find_the_number_of_days_in_a_month {
    public static void main(String[] args) {
        // The key to solve this problem is to check whether the year is leap year. A year is a leap year if it is
        // divisible by 4 but not by 100, or if it is divisible by 400. Refer to Listing 3.7 LeapYear.java
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        switch (month) {
            case 1:
                System.out.println("January " + year + " had 31 days");
                break;
            case 2:
                System.out.print("February " + year + " had ");
                System.out.println(isLeapYear ? "29 days" : "28 days");
                break;
            case 3:
                System.out.println("March " + year + " had 31 days");
                break;
            case 4:
                System.out.println("April " + year + " had 30 days");
                break;
            case 5:
                System.out.println("May " + year + " had 31 days");
                break;
            case 6:
                System.out.println("June " + year + " had 30 days");
                break;
            case 7:
                System.out.println("July " + year + " had 31 days");
                break;
            case 8:
                System.out.println("August " + year + " had 31 days");
                break;
            case 9:
                System.out.println("September " + year + " had 30 days");
                break;
            case 10:
                System.out.println("October " + year + " had 31 days");
                break;
            case 11:
                System.out.println("November " + year + " had 30 days");
                break;
            case 12:
                System.out.println("December " + year + " had 31 days");
                break;
        }
    }
}
