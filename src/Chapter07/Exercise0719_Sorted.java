/**
 * (Sorted?) Write the following method that returns true if the list is already sorted
 * in decreasing order.
 * public static boolean isSorted(int[] list)
 * Write a test program that prompts the user to enter a list and displays whether
 * the list is sorted or not. Here is a sample run. Note that the first number in the
 * input indicates the number of the elements in the list. This number is not part
 * of the list.
 * Enter list: 8 10 1 5 16 61 9 11 1
 * The list is not sorted
 * Enter list: 10 21 11 9 7 5 4 4 3 1 1
 * The list is already sorted
 *
 * Created by Sven on 08/20/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0719_Sorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int numberOfElements = input.nextInt();
        int[] numbers = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println(isSorted(numbers) ? "The list is already sorted" : "The list is not sorted");
    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] < list[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
