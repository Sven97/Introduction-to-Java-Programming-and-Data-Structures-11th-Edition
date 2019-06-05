/**
 * (Financial application: find the sales amount) Rewrite Programming Exercise 5.39
 * as follows:
 * ■ Use a while loop instead of a do-while loop.
 * ■ Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.
 *
 * Created by Sven on 06/05/19.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0542_Financial_application_find_the_sales_amount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double commission = 0.0;
        double salesAmount = 0.0;

        System.out.print("Enter commission amount: ");
        double COMMISSION_SOUGHT = input.nextInt();

        while (salesAmount - commission < COMMISSION_SOUGHT) {
            salesAmount += 0.01;

            if (salesAmount > 10000.0) {
                commission = 700.0 + (salesAmount - 10000.0) * 0.1;
            } else if (salesAmount > 5000.0) {
                commission = 300.0 + (salesAmount - 5000.0) * 0.08;
            } else {
                commission = salesAmount * 0.06;
            }
        }

        System.out.println("You need $" + (int) salesAmount + " sales amount to make a commission of $" + COMMISSION_SOUGHT);
    }
}
