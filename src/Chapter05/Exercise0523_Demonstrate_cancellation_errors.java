/**
 * (Demonstrate cancellation errors) A cancellation error occurs when you are
 * manipulating a very large number with a very small number. The large number
 * may cancel out the smaller number. For example, the result of 100000000.0 +
 * 0.000000001 is equal to 100000000.0. To avoid cancellation errors and obtain
 * more accurate results, carefully select the order of computation. For example, in
 * computing the following summation, you will obtain more accurate results by
 * computing from right to left rather than from left to right:
 * 1 + 1/2 + 1/3 + ... + 1/n
 * Write a program that compares the results of the summation of the preceding series,
 * computing from left to right and from right to left with n = 50000.
 *
 * Created by Sven on 3/21/2019.
 */
package Chapter05;

public class Exercise0523_Demonstrate_cancellation_errors {
    public static void main(String[] args) {
        int n = 50000;
        double result1 = 0, result2 = 0;
        for (int i = 1; i <= n; i++) {
            result1 += 1.0 / i;
        }
        System.out.println("Computing from left to right: " + result1);

        for (int i = n; i >= 1; i--) {
            result2 += 1.0 / i;
        }
        System.out.println("Computing from right to left: " + result2);
    }
}
