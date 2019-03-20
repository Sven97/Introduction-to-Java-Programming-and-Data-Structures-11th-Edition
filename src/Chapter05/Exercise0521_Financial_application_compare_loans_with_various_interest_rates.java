/**
 * (Financial application: compare loans with various interest rates) Write a program
 * that lets the user enter the loan amount and loan period in number of years and
 * displays the monthly and total payments for each interest rate starting from 5% to
 * 10%, with an increment of 1/4. Here is a sample run:
 * Loan Amount: 10000
 * Number of Years: 5
 * Interest Rate     Monthly Payment       Total Payment
 *    5.000%             212.71              12762.82
 *    5.250%             215.26              12915.48
 *    5.500%             217.83              13069.60
 *    5.750%             220.42              13225.19
 *    6.000%             223.04              13382.26
 *    6.250%             225.68              13540.81
 *    6.500%             228.35              13700.87
 *    6.750%             231.04              13862.43
 *    7.000%             233.76              14025.52
 *    7.250%             236.50              14190.13
 *    7.500%             239.27              14356.29
 *    7.750%             242.07              14524.01
 *    8.000%             244.89              14693.28
 *    8.250%             247.74              14864.13
 *    8.500%             250.61              15036.57
 *    8.750%             253.51              15210.60
 *    9.000%             256.44              15386.24
 *    9.250%             259.39              15563.50
 *    9.500%             262.37              15742.39
 *    9.750%             265.38              15922.92
 *   10.000%             268.42              16105.10
 *
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
