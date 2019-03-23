/**
 * (Financial application: compound value) Suppose you save $100 each month
 * in a savings account with annual interest rate 3.75%. The monthly interest rate
 * is 0.0375 / 12 = 0.003125. After the first month, the value in the account
 * becomes
 * 100 * (1 + 0.003125) = 100.3125
 * After the second month, the value in the account becomes
 * 100 + 100.3125) * (1 + 0.003125) = 200.938
 * After the third month, the value in the account becomes
 * (100 + 200.938) * (1 + 0.003125) = 301.878
 * and so on.
 * Write a program that prompts the user to enter an amount (e.g., 100), the annual
 * interest rate (e.g., 3.75), and the number of months (e.g., 6) and displays the
 * amount in the savings account after the given month.
 *
 * Created by Sven on 3/23/2019.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0530_Financial_application_compound_value {
    public static void main(String[] strings) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount to save each month: ");
        double monthlySavings = input.nextDouble();
        System.out.print("Enter annual interest: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of months: ");
        int numberOfMonths = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200.0D;
        double accountValue = monthlySavings * (1.0D + monthlyInterestRate);

        for (int i = 1; i < numberOfMonths; i++) {
            accountValue = (accountValue + monthlySavings) * (1.0D + monthlyInterestRate);
        }
        System.out.println("After month #" + numberOfMonths + ", the account value is " + accountValue);
    }
}
