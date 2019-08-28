/**
 * (Partition of a list) Write the following method that partitions the list using the
 * first element, called a pivot:
 * public static int partition(int[] list)
 * After the partition, the elements in the list are rearranged so all the elements before
 * the pivot are less than or equal to the pivot, and the elements after the pivot are
 * greater than the pivot. The method returns the index where the pivot is located in
 * the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}. After the partition,
 * the list becomes {3, 2, 5, 9, 6, 8}. Implement the method in a way that takes at
 * most list.length comparisons. See liveexample.pearsoncmg.com/dsanimation/
 * QuickSortNeweBook.html for an animation of the implementation. Write a
 * test program that prompts the user to enter the size of the list and the contents of
 * the list and displays the list after the partition. Here is a sample run.
 *
 * Enter list size: 8
 * Enter list content: 10 1 5 16 61 9 11 1
 * After the partition, the list is 9 1 5 1 10 61 11 16
 *
 * Created by Sven on 08/28/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0732_Partition_of_a_list {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = input.nextInt();
        int[] list = new int[size];
        System.out.print("Enter list content: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        int[] resultList = partition(list);
        System.out.print("After the partition, the list is ");
        for (int i = 0; i < resultList.length; i++) {
            System.out.print(resultList[i] + " ");
        }
    }

    public static int[] partition(int[] list) {
        int pivot = list[0];
        int low = 1;
        int high = list.length - 1;

        while (pivot != list[high]) {
            if (list[low] <= pivot) {
                /* Since list[low] <= pivot, low was moved forward.*/
                low++;
            } else {
                if (list[high] > pivot) {
                    /* Since list[high] > pivot, high was moved backward.*/
                    high--;
                } else {
                    /* Swap list[low] and list[high]. */
                    int temp = list[low];
                    list[low] = list[high];
                    list[high] = temp;
                }
            }

            if (high < low) {
                list[0] = list[high];
                list[high] = pivot;
            }
        }
        return list;
    }
}
