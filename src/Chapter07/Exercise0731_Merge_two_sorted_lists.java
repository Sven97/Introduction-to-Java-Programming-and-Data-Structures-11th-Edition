/**
 * (Merge two sorted lists) Write the following method that merges two sorted lists
 * into a new sorted list:
 * public static int[] merge(int[] list1, int[] list2)
 * Implement the method in a way that takes at most list1.length + list2.
 * length comparisons. See liveexample.pearsoncmg.com/dsanimation/
 * MergeSortNeweBook.html for an animation of the implementation. Write a test
 * program that prompts the user to enter two sorted lists and displays the merged
 * list. Here is a sample run. Note the first number in the input indicates the number
 * of the elements in the list. This number is not part of the list.
 *
 * Enter list1 size and contents: 5 1 5 16 61 111
 * Enter list2 size and contents: 4 2 4 5 6
 * list1 is 1 5 16 61 111
 * list2 is 2 4 5 6
 * The merged list is 1 2 4 5 5 6 16 61 111
 *
 * Created by Sven on 08/28/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0731_Merge_two_sorted_lists {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 size and contents: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2 size and contents: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            list2[i] = input.nextInt();
        }

        System.out.print("list1 is ");
        for (int i = 0; i < list1.length; i++) {
            System.out.print(list1[i] + " ");
        }
        System.out.print("\nlist2 is ");
        for (int i = 0; i < list2.length; i++) {
            System.out.print(list2[i] + " ");
        }

        int[] mergedList = merge(list1, list2);
        System.out.print("\nThe merged list is is ");
        for (int i = 0; i < mergedList.length; i++) {
            System.out.print(mergedList[i] + " ");
        }


    }

    public static int[] merge(int[] list1, int[] list2) {
        int mergedSize = list1.length + list2.length;
        int[] mergedList = new int[mergedSize];

        int index1 = 0;
        int index2 = 0;
        int index3 = 0;

        /* Start merging */
        while (index1 < list1.length && index2 < list2.length) {
            if (list1[index1] <= list2[index2]) {
                mergedList[index3] = list1[index1];
                index1++;
            } else {
                mergedList[index3] = list2[index2];
                index2++;
            }
            index3++;
        }

        /* Copy remaining elements of list1[] if any */
        while (index1 < list1.length) {
            mergedList[index3] = list1[index1];
            index1++;
            index3++;
        }

        /* Copy remaining elements of list2[] if any */
        while (index2 < list2.length) {
            mergedList[index3] = list2[index2];
            index2++;
            index3++;
        }

        return mergedList;
    }
}
