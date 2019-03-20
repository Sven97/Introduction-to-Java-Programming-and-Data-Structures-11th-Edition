/**
 * (Sum a series) Write a program to compute the following summation:
 * 1/3 + 3/5 + 5/7 + ... + 97/99
 *
 * Created by Sven on 3/21/2019.
 */
package Chapter05;

public class Exercise0524_Sum_a_series {
    public static void main(String[] args) {
        double result = 0;
        for (int i = 1; i <= 97; i++) {
            result += 1.0 * i / (i + 2);
        }
        System.out.println("The result for 1/3 + 3/5 + 5/7 + ... + 97/99 is " + result);
    }
}
