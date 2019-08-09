/**
 * (Eliminate duplicates) Write a method that returns a new array by eliminating the
 * duplicate values in the array using the following method header:
 * public static int[] eliminateDuplicates(int[] list)
 * Write a test program that reads in 10 integers, invokes the method, and displays
 * the distinct numbers separated by exactly one space. Here is a sample run of the
 * program:
 * Enter 10 numbers: 1 2 3 2 1 6 3 4 5 2
 * The distinct numbers are: 1 2 3 6 4 5
 *
 * Created by Sven on 08/08/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0715_Eliminate_duplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int[] distinctNumbers = eliminateDuplicates(numbers);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < distinctNumbers.length; i++) {
            System.out.print(distinctNumbers[i] + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        if (list.length == 0 || list.length == 1) {
            return list;
        }
        int[] tempArray = new int[list.length];

        int count = 0;
        for (int i = 0; i < list.length; i++) {
            int currentElement = list[i];

            boolean isDuplicated = false;
            for (int j = 0; j < count; j++) {
                if (currentElement == tempArray[j]) {
                    isDuplicated = true;
                    break;
                }
            }

            if (!isDuplicated) {
                tempArray[count++] = currentElement;
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = tempArray[i];
        }

        return result;
    }
}
