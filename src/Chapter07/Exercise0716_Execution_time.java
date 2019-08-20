/**
 * (Execution time) Write a program that creates an array of numbers from 1 to
 * 100,000,000 in ascending order. Display the execution time of invoking the
 * linearSearch method and the binarySearch method in Listings 7.6 and
 * 7.7 respectively. Display the execution time of invoking both searches for the following
 * numbers: 1; 25,000,000; 50,000,000; 75,000,000; 100,000,000. You can
 * use the following code template to obtain the execution time:
 * long startTime = System.nanoTime();
 * perform the task;
 * long endTime = System.nanoTime();
 * long executionTime = endTime − startTime;
 *
 * Created by Sven on 08/20/19.
 */
package Chapter07;

public class Exercise0716_Execution_time {
    public static void main(String[] args) {
        int[] list = new int[100000000];
        for (int i = 1; i < 100000000; i++) {
            list[i] = i;
        }

        long startTime, endTime, executionTime;
        int[] searchNum = {1, 25000000, 50000000, 75000000, 100000000};
        long[] linearSearchTime = new long[searchNum.length];
        long[] binarySearchTime = new long[searchNum.length];
        for (int i = 0; i < searchNum.length; i++) {
            // linear search
            startTime = System.nanoTime();
            linearSearch(list, searchNum[i]);
            endTime = System.nanoTime();
            executionTime = endTime - startTime;
            linearSearchTime[i] = executionTime;

            // binary search
            startTime = System.nanoTime();
            binarySearch(list, searchNum[i]);
            endTime = System.nanoTime();
            executionTime = endTime - startTime;
            binarySearchTime[i] = executionTime;
        }

        System.out.println("Search Number  |  Linear Search  |  Binary Search");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < searchNum.length; i++) {
            System.out.printf("%-13d  |  %-13d  |  %-13d\n", searchNum[i], linearSearchTime[i], binarySearchTime[i]);
        }
    }


    /**
     * The method for finding a key in the list
     */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }

    /**
     * Use binary search to find the key in the list
     */
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else low = mid + 1;
        }

        return -low - 1; // Now high < low
    }


}
