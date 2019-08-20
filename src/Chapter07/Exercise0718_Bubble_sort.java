/**
 * (Sort students) Write a program that prompts the user to enter the number of students,
 * the students’ names, and their scores and prints student names in decreasing
 * order of their scores. Assume the name is a string without spaces, use the Scanner’s
 * next() method to read a name.
 *
 * Created by Sven on 08/20/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0718_Bubble_sort {
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
                if (list[j] > list[j + 1]) {
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
