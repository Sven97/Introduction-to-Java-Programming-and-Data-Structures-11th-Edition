/**
 * (Check whether the array is sorted with constant interval) An array list is sorted
 * with a constant interval if its elements are arranged in an ascending order and there
 * is a constant difference between adjacent elements. Write a method that returns
 * true if list is sorted with a constant interval, using the following header:
 * public static boolean isSortedConstantInterval(int[] list)
 * Write a test program that prompts the user to enter a list of integers. Note the first
 * number in the input indicates the number of elements in the list. This number is
 * not part of the list.
 *
 * Enter list: 5 2 5 6 9 10
 * The list is not sorted with a constant interval
 * Enter list: 5 2 4 6 8 10
 * The list is sorted with a constant interval.
 *
 * Created by Sven on 08/24/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0727_Check_whether_the_array_is_sorted_with_constant_interval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int numberOfElements = input.nextInt();
        int[] numbers = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println(isSortedConstantInterval(numbers) ? "The list is sorted with a constant interval" : "The list is not sorted with a constant interval");
    }

    public static boolean isSortedConstantInterval(int[] list) {
        int difference = list[1] - list[0];
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            } else {
                if (list[i + 1] - list[i] != difference) {
                    return false;
                }
            }
        }
        return true;
    }
}
