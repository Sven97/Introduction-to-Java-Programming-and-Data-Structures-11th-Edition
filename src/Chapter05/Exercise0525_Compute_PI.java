/**
 * (Compute p) You can approximate p by using the following summation:
 * PI = 4(1 - 1/3 + 1/5 - 1/7 + 1/9 - ... + ((-)^(i+1))/(2i - 1))
 * Write a program that displays the p value for i = 10000, 20000, …, and 100000.
 *
 * Created by Sven on 3/21/2019.
 */
package Chapter05;

public class Exercise0525_Compute_PI {
    public static void main(String[] args) {
        double PI = 1.0;
        for (int i = 2; i <= 100000; i++) {
            PI += Math.pow(-1, i + 1) / (2 * i - 1.0D);
            if (i % 10000 == 0) {
                System.out.println("i = " + i + "\tPI = " + 4.0 * PI);
            }
        }
    }
}
