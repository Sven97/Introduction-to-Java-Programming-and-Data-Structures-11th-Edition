/**
 * (Sum series) Write a method to compute the following series:
 * m(i) = 1/3 +2/4 + ... + i/i+2
 * Write a test program that displays the following table:
 * I m(i)
 * 1 0.3333
 * 2 0.8333
 * ...
 * 19 14.7093
 * 20 15.6184
 *
 * Created by Sven on 07/07/19.
 */
package Chapter06;

public class Exercise0613_Sum_series {
    public static void main(String[] args) {
        System.out.println("i    m(i)");
        System.out.println("---------");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-5d%.4f\n", i, computeSum(i));
        }
    }

    public static double computeSum(int i) {
        double sum = 0.0;
        for (int j = 1; j <= i; j++) {
            sum += (double) j / (double) (j + 2);
        }
        return sum;
    }

}
