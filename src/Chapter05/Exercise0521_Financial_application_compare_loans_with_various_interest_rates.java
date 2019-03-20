/**
 * (Financial application: compare loans with various interest rates) Write a program
 * that lets the user enter the loan amount and loan period in number of years and
 * displays the monthly and total payments for each interest rate starting from 5% to
 * 10%, with an increment of 1/4. Here is a sample run:
 * Loan Amount: 10000
 * Number of Years: 5
 * Interest Rate Monthly Payment Total Payment
 * 5.000%          188.71           11322.74
 * 5.250%          189.86           11391.59
 * 5.500%          191.01           11460.70
 * ...
 * 9.750%          211.24           12674.55
 * 10.000%         212.47           12748.23
 * Created by Sven on 3/21/2019.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0521_Financial_application_compare_loans_with_various_interest_rates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numOfYear = input.nextInt();

        double interestRate = 0.05;
        System.out.printf("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        while (interestRate <= 0.1000001) {
            double totalPayment = loanAmount * Math.pow((1 + interestRate), numOfYear);
            double monthlyPayment = totalPayment / 12 / numOfYear;
            String str = "%";
            System.out.printf("%8.3f%s%19.2f%22.2f\n", interestRate * 100, str,monthlyPayment,totalPayment );

            interestRate += 0.0025;
        }
    }
}
