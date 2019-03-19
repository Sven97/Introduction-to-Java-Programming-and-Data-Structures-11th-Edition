/**
 * (Compute the greatest common divisor) Another solution for Listing 5.9 to find the
 * greatest common divisor of two integers n1 and n2 is as follows: First find d to be
 * the minimum of n1 and n2, then check whether d, d–1, d–2, …, 2, or 1 is a divisor
 * for both n1 and n2 in this order. The first such common divisor is the greatest
 * common divisor for n1 and n2. Write a program that prompts the user to enter two
 * positive integers and displays the gcd.
 *
 * Created by Sven on 3/19/2019.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0514_Compute_the_greatest_common_divisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two positive number: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int d = (n1 <= n2) ? n1 : n2;

        while (d > 0) {
            if (n1 % d == 0 && n2 % d == 0) {
                break;
            }
            d--;
        }

        System.out.println("GCD of " + n1 + " and " + n2 + " is " + d);
    }
}
