/**
 * (Estimate p) p can be computed using the following summation:
 * m (i) = 4 (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + ((-1)^(i+1))/(2i-1))
 * Write a method that returns m(i) for a given i and write a test program that
 * displays the following table:
 * i m(i)
 * 1 4.0000
 * 101 3.1515
 * 201 3.1466
 * 301 3.1449
 * 401 3.1441
 * 501 3.1436
 * 601 3.1433
 * 701 3.1430
 * 801 3.1428
 * 901 3.1427
 *
 * Created by Sven on 07/07/19.
 */
package Chapter06;

public class Exercise0614_Estimate_PI {
    public static void main(String[] args) {
        System.out.println("i    m(i)");
        System.out.println("---------");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-5d%.4f\n", i, computePI(i));
        }
    }

    public static double computePI(int i) {
        double sum = 0.0;
        for (int j = 1; j <= i; j++) {
            sum += 4 * (Math.pow(-1, j + 1) / (2 * j - 1));
        }
        return sum;
    }
}
