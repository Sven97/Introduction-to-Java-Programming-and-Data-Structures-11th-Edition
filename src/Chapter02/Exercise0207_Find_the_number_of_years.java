/**
 * (Find the number of years) Write a program that prompts the user to enter the minutes (e.g., 1 billion), and displays
 * the number of years and days for the minutes. For simplicity, assume a year has 365 days.
 *
 * Here is a sample run:
 * Enter the number of minutes: 1000000000
 * 1000000000 minutes is approximately 1902 years and 214 days
 *
 * Created by Sven on 8/17/2018.
 */
package Chapter02;

import java.util.Scanner;

public class Exercise0207_Find_the_number_of_years {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        int totalDays = minutes / 60 / 24;
        int totalYears = totalDays / 365;
        int remainDays = totalDays - totalYears * 365;
        System.out.println(minutes + " minutes is approximately " + totalYears + " years and " + remainDays + " days");
    }
}
