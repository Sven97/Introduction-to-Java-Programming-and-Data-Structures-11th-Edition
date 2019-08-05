/**
 * (Find the index of the largest element) Write a method that returns the index of the
 * largest element in an array of integers. If there is more than one element, return
 * the largest index. Use the following header:
 * public static int indexOfLargestElement(double[] array)
 * Write a test program that prompts the user to enter 10 numbers, invokes this
 * method to return the index of the largest element, and displays the index and the
 * element itself.
 *
 * Created by Sven on 08/05/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0710_Find_the_index_of_the_largest_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("The maximum number is indexed as: " + indexOfLargestElement(numbers));
    }

    public static int indexOfLargestElement(double[] array) {
        int indexOfLargestElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array[indexOfLargestElement]) {
                indexOfLargestElement = i;
            }
        }
        return indexOfLargestElement;
    }
}
