/**
 * (Check whether array is sorted) An array list is required to be sorted in ascending
 * order. Write a method that returns true if list is sorted, using the following header:
 * public static Bboolean isSorted(int[] list)
 * Write a test program that prompts the user to enter a list of integers. Note the first
 * number in the input indicates the number of elements in the list. This number is
 * not part of the list.
 *
 * Enter list: 5 2 5 6 9 10
 * The list is sorted
 * Enter list: 5 2 5 6 1 6
 * The list is not sorted.
 *
 * Created by Sven on 08/24/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0726_Check_whether_array_is_sorted {
    public static void main(String[] args) {
        // Same logic as Exercise 0719
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int numberOfElements = input.nextInt();
        int[] numbers = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println(isSorted(numbers) ? "The list is sorted" : "The list is not sorted");
    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
