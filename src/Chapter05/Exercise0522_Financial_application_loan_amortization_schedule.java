/**
 * (Financial application: loan amortization schedule) The monthly payment for a given
 * loan pays the principal and the interest. The monthly interest is computed by multiplying
 * the monthly interest rate and the balance (the remaining principal). The principal
 * paid for the month is therefore the monthly payment minus the monthly interest.
 * Write a program that lets the user enter the loan amount, number of years, and interest
 * rate then displays the amortization schedule for the loan. Here is a sample run:
 *
 * Loan Amount: 10000
 * Number of Years: 1
 * Annual Interest Rate: 7
 *
 * Monthly Payment: 865.26
 * Total Payment: 10383.2
 *
 * Payment#	Interest	Principal	Balance
 * 1			58.33		806.93		9193.07
 * 2			53.62		811.64		8381.43
 * 3			48.89		816.37		7565.06
 * 4			44.12		821.14		6743.92
 * 5			39.33		825.93		5917.99
 * 6			34.52		830.74		5087.25
 * 7			29.67		835.59		4251.66
 * 8			24.8		840.46		3411.2
 * 9			19.89		845.37		2565.83
 * 10			14.96		850.3		1715.53
 * 11			10.0		855.26		860.27
 * 12			5.01		860.25		0.01
 *
 * Created by Sven on 3/21/2019.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0522_Financial_application_loan_amortization_schedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numOfYear = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        // Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Compute mortgage
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numOfYear * 12)));
        double balance = loanAmount;
        double interest;
        double principal;

        System.out.println("\nMonthly Payment: " + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("Total Payment: " + (int) (monthlyPayment * 12 * numOfYear * 100) / 100.0);

        // Display the header
        System.out.println("\nPayment#\tInterest\tPrincipal\tBalance");
        for (int i = 1; i <= numOfYear * 12; i++) {
            interest = (int) (monthlyInterestRate * balance * 100) / 100.0;
            principal = (int) ((monthlyPayment - interest) * 100) / 100.0;
            balance = (int) ((balance - principal) * 100) / 100.0;
            System.out.println(i + "\t\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
        }
    }
}
