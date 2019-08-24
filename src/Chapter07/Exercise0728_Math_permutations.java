/**
 * (Math: permutations) Write a program that prompts the user to enter four integers
 * and then displays all possible ways of arranging the four integers.
 *
 * Created by Sven on 08/24/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0728_Math_permutations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter four integers: ");
        int[] list = new int[4];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        permutation(list, 4);
    }

    // print n! permutation of the elements of array a (not in order)
    private static void permutation(int[] a, int n) {
        if (n == 1) {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(a, i, n - 1);
            permutation(a, n - 1);
            swap(a, i, n - 1);
        }
    }

    // swap the characters at indices i and j
    private static void swap(int[] a, int i, int j) {
        int c = a[i];
        a[i] = a[j];
        a[j] = c;
    }
}
