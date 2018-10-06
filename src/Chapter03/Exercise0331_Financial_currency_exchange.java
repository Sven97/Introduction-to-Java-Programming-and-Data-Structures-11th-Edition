/**
 * (Financials: currency exchange) Write a program that prompts the user to enter
 * the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
 * to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
 * Chinese RMB to U.S. dollars. Prompt the user to enter the amount in U.S. dollars
 * or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
 *
 * Here are the sample runs:
 * Enter the exchange rate from dollars to RMB: 6.81
 * Enter 0 to convert dollars to RMB and 1 vice versa: 0
 * Enter the dollar amount: 100
 * $100.0 is 681.0 yuan
 * Enter the exchange rate from dollars to RMB: 6.81
 * Enter 0 to convert dollars to RMB and 1 vice versa: 5
 * Enter the RMB amount: 10000
 * 10000.0 yuan is $1468.43
 *
 * Created by Sven on 8/26/2018.
 */
package Chapter03;

import java.util.Scanner;

public class Exercise0331_Financial_currency_exchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        double convertDirection = input.nextDouble(); // 0 for dollars to RMB, 1 for RMB to dollars

        double dollars, rmb;
        if (convertDirection == 0) {
            System.out.print("Enter the dollar amount: ");
            dollars = input.nextDouble();
            rmb = dollars * exchangeRate;
            System.out.println("$" + dollars + " is " + rmb + " yuan");
        } else {
            System.out.print("Enter the RMB amount: ");
            rmb = input.nextDouble();
            dollars = rmb / exchangeRate;
            System.out.println(rmb + " yuan is $" + dollars);
        }
    }
}
