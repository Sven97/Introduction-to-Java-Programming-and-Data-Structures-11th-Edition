/**
 * (Month name) Write a program that prompts the user to enter an integer between
 * 1 and 12 and then displays the name of the month that corresponds to the integer
 * entered by the user. For example, if the user enters three, the program should
 * display March.
 *
 * Created by Sven on 08/28/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0733_Month_name {
    public static void main(String[] args) {
        final String[] MONTH_NAME = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };
        Scanner input = new Scanner(System.in);
        int monthNum = 0;
        while (monthNum <= 0 || monthNum >= 13) {
            System.out.print("Enter a number (1-12): ");
            monthNum = input.nextInt();
        }

        System.out.println(MONTH_NAME[monthNum - 1]);
    }
}
