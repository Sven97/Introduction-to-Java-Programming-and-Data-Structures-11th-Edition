/**
 * (Financial application: find the sales amount) You have just started a sales job in a
 * department store. Your pay consists of a base salary and a commission. The base salary
 * is $5,000. The scheme shown below is used to determine the commission rate.
 * Sales Amount          Commission Rate
 * $0.01–$5,000         6 percent
 * $5,000.01–$10,000    8 percent
 * $10,000.01 and above  10 percent
 * Note that this is a graduated rate. The rate for the first $5,000 is at 6%, the next
 * $5000 is at 8%, and the rest is at 10%. If your sales amounts to $25,000, the commission
 * is 5,000 * 6% + 5,000 * 8% + 15,000 * 10% = 2,200. Your goal is to
 * earn $30,000 a year. Write a program to find the minimum sales you have to generate
 * in order to make $30,000.
 *
 * Created by Sven on 4/14/2019.
 */
package Chapter05;

public class Exercise0539_Financial_application_find_the_sales_amount {
    public static void main(String[] args) {
        double commission;
        double salesAmount = 0.0;
        do {
            salesAmount += 0.01;

            if (salesAmount > 10000.0) {
                commission = 700.0 + (salesAmount - 10000.0) * 0.1;
            } else if (salesAmount > 5000.0) {
                commission = 300.0 + (salesAmount - 5000.0) * 0.08;
            } else {
                commission = salesAmount * 0.06;
            }
        } while (salesAmount - commission < 30000.0);

        System.out.println("You need $" + (int) salesAmount + " sales amount to make a commission of $30000");

    }
}
