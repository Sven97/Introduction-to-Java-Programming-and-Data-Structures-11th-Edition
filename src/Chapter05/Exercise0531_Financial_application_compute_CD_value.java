/**
 * (Financial application: compute CD value) Suppose you put $10,000 into a CD
 * with an annual percentage yield of 6.15%. After one month, the CD is worth
 * 10000 + 10000 * 6.15 / 1200 = 10051.25
 * After two months, the CD is worth
 * 10051.25 + 10051.25 * 6.15 / 1200 = 10102.76
 * After three months, the CD is worth
 * 10102.76 + 10102.76 * 6.15 / 1200 = 10154.53
 * and so on.
 * Write a program that prompts the user to enter an amount (e.g., 10000), the annual
 * percentage yield (e.g., 6.15), and the number of months (e.g., 18) and displays a
 * table as shown in the sample run.
 *
 * Enter the initial deposit amount: 10000
 * Enter annual percentage yield: 6.15
 * Enter maturity period (number of months): 18
 * Month CD Value
 * 1 10051.25
 * 2 10102.76
 * ...
 * 17 10907.90
 * 18 10963.81
 *
 * Created by Sven on 3/26/2019.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0531_Financial_application_compute_CD_value {
    private int i;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        double deposit = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200.0;
        System.out.print("Enter maturity period in months: ");
        double numberOfMonths = input.nextInt();

        System.out.printf("%-10s%-10s\n","Months","CD Value");
        double accountValue = deposit;
        for (int i = 1; i <= numberOfMonths; i++) {
            accountValue *= (1.0D + monthlyInterestRate);
            System.out.printf("%-10d%-10.2f\n", i, accountValue);
        }
    }
}
