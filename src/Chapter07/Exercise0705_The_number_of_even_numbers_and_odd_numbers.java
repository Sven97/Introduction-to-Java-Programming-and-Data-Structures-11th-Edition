/**
 * (The number of even numbers and odd numbers) Write a program that reads ten
 * integers, and then display the number of even numbers and odd numbers. Assume
 * that the input ends with 0. Here is the sample run of the program.
 * Enter numbers: 1 2 3 2 1 6 3 4 5 2 3 6 8 9 9 0
 * The number of odd numbers: 8
 * The number of even numbers: 7
 *
 * Created by Sven on 07/30/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0705_The_number_of_even_numbers_and_odd_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int oddCount = 0;
        int evenCount = 0;
        while (!input.hasNext("0")) {
            if (input.nextInt() % 2 != 0) {
                oddCount++;
            } else {
                evenCount++;
            }
        }

        System.out.println("The number of odd numbers: " + oddCount);
        System.out.println("The number of even numbers: " + evenCount);

    }
}
