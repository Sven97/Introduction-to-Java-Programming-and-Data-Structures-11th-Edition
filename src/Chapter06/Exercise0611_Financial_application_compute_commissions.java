/**
 * (Financial application: compute commissions) Write a method that computes the
 * commission, using the scheme in Programming Exercise 5.39. The header of
 * the method is as follows:
 * public static double computeCommission(double salesAmount)
 * Write a test program that displays the following table:
 * Sales Amount Commission
 * 10000 900.0
 * 15000 1500.0
 * ...
 * 95000 11100.0
 * 100000 11700.0
 *
 * Created by Sven on 07/07/19.
 */
package Chapter06;

public class Exercise0611_Financial_application_compute_commissions {
    public static void main(String[] args) {
        System.out.println("Sales Amount    Commission");
        System.out.println("--------------------------");
        for (int i = 10000; i <= 100000; i += 5000) {
            System.out.printf("%-16d%10.1f\n", i, computeCommission(i));
        }
    }

    public static double computeCommission(double salesAmount) {
        double commission = 0.0;
        if (salesAmount > 10000.0) {
            commission = 700.0 + (salesAmount - 10000.0) * 0.1;
        } else if (salesAmount > 5000.0) {
            commission = 300.0 + (salesAmount - 5000.0) * 0.08;
        } else {
            commission = salesAmount * 0.06;
        }
        return commission;
    }
}
