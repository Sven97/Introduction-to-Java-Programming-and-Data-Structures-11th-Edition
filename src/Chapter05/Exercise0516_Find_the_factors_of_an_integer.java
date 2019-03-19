/**
 * (Find the factors of an integer) Write a program that reads an integer and displays
 * all its smallest factors in an increasing order. For example, if the input integer is
 * 120, the output should be as follows: 2, 2, 2, 3, 5.
 *
 * Created by Sven on 3/19/2019.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0516_Find_the_factors_of_an_integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int factor = 2;

        while (factor <= num) {
            if (num % factor == 0) {
                System.out.print(factor + " ");
                num /= factor;
            } else {
                factor++;
            }
        }

    }
}
