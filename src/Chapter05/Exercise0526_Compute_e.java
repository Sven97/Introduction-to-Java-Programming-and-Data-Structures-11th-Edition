/**
 * (Compute e) You can approximate e using the following summation:
 * e = 1 + 1/1! + 1/2! + 1/3! + ... + 1/i!
 * Write a program that displays the e value for i = 10000, 20000, …, and 100000.
 * (Hint: Because i! = i * (i - 1) * ... * 2 * 1, then 1/i! is 1/(i(i-1)!)
 * Initialize e and item to be 1, and keep adding a new item to e. The new item is
 * the previous item divided by i, for i >= 2.)
 *
 * Created by Sven on 3/23/2019.
 */
package Chapter05;

public class Exercise0526_Compute_e {
    public static void main(String[] strings) {
        double e = 1.0;
        double item = 1.0;
        for (int i = 2; i <= 100000; i++) {
            item /= (double) i;
            e += item;
            if (i % 10000 == 0) {
                System.out.println("i = " + i + "\te = " + e);
            }
        }
    }
}
