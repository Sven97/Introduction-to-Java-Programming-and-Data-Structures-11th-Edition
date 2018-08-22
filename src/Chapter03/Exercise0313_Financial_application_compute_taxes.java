/**
 * (Financial application: compute taxes) Listing 3.5, ComputeTax.java, gives the source code to compute taxes for
 * single filers. Complete Listing 3.5 to compute the taxes for all filing statuses.
 *
 * Created by Sven on 8/22/2018.
 */
package Chapter03;

import java.util.Scanner;

public class Exercise0313_Financial_application_compute_taxes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("(0-single filer, 1-married jointly or qualifying widow(er), 2-married separately, 3-head " +
                "of household) Enter the filing status: ");

        int status = input.nextInt();

        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        double tax = 0;
        double demarcation10, demarcation15, demarcation25, demarcation28, demarcation33;

        if (status == 0) {
            demarcation10 = 8350;
            demarcation15 = 33950;
            demarcation25 = 82250;
            demarcation28 = 171550;
            demarcation33 = 372950;
        } else if (status == 1) {
            demarcation10 = 16700;
            demarcation15 = 67900;
            demarcation25 = 137050;
            demarcation28 = 208850;
            demarcation33 = 372950;
        } else if (status == 2) {
            demarcation10 = 8350;
            demarcation15 = 33950;
            demarcation25 = 68525;
            demarcation28 = 104425;
            demarcation33 = 186475;
        } else if (status == 3) {
            demarcation10 = 11950;
            demarcation15 = 45500;
            demarcation25 = 117450;
            demarcation28 = 190200;
            demarcation33 = 372950;
        } else {
            demarcation10 = 0;
            demarcation15 = 0;
            demarcation25 = 0;
            demarcation28 = 0;
            demarcation33 = 0;
            System.out.println("Error: invalid status");
            System.exit(1);
        }
        if (income <= demarcation10)
            tax = income * 0.10;
        else if (income <= demarcation15)
            tax = demarcation10 * 0.10 + (income - demarcation10) * 0.15;
        else if (income <= demarcation25)
            tax = demarcation10 * 0.10 + (demarcation15 - demarcation10) * 0.15 + (income - demarcation15) * 0.25;
        else if (income <= demarcation28)
            tax = demarcation10 * 0.10 + (demarcation15 - demarcation10) * 0.15 + (demarcation25 - demarcation15) * 0.25
                    + (income - demarcation25) * 0.28;
        else if (income <= demarcation33)
            tax = demarcation10 * 0.10 + (demarcation15 - demarcation10) * 0.15 + (demarcation25 - demarcation15) * 0.25
                    + (demarcation28 - demarcation25) * 0.28 + (income - demarcation28) * 0.33;
        else
            tax = demarcation10 * 0.10 + (demarcation15 - demarcation10) * 0.15 + (demarcation25 - demarcation15) * 0.25
                    + (demarcation28 - demarcation25) * 0.28 + (demarcation33 - demarcation28) * 0.33
                    + (income - demarcation33) * 0.35;
        System.out.println("Tax is " + (int) (tax * 100) / 100.0);
    }
}
