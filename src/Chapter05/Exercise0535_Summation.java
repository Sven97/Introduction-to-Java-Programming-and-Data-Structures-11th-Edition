/**
 * (Summation) Write a program to compute the following summation:
 * 1/(1+sqrt(2))+ 1/(sqrt(2)+sqrt(3))+ 1/(sqrt(3)+sqrt(4))+ ... + 1/(sqrt(999)+sqrt(1000))
 *
 * Created by Sven on 4/14/2019.
 */
package Chapter05;

public class Exercise0535_Summation {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i <= 999; i++) {
            sum += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }
        System.out.println("Sum in the order that from left to right: " + sum);

        sum = 0.0;
        for (int i = 999; i >= 1; i--) {
            sum += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }
        System.out.print("Sum in the order that from right to left: " + sum);
        System.out.println(" (More accurate to sum from the smaller one to the bigger one when adding a series)");
    }
}
