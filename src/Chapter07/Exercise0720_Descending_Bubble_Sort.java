/**
 * (Descending Bubble Sort) Modify the bubble sort method of Programming
 * Exercise 7.18, and sort the elements in the array in descending order instead of
 * ascending order. Write a test program that reads 10 double numbers, invokes the
 * method, and displays the sorted numbers in descending order.
 *
 * Created by Sven on 08/20/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0720_Descending_Bubble_Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 double numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        double[] sortedList = bubbleSort(numbers);
        for (int i = 0; i < sortedList.length; i++) {
            System.out.print(sortedList[i] + " ");
        }
    }

    public static double[] bubbleSort(double[] list) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j] < list[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    double temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }
}
