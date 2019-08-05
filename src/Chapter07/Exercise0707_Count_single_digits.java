/**
 * (Count single digits) Write a program that generates 200 random integers between
 * 0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
 * say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 *
 * Created by Sven on 08/05/19.
 */
package Chapter07;

public class Exercise0707_Count_single_digits {
    public static void main(String[] args) {
        int[] counts = new int[10];
        for (int i = 0; i < 200; i++) {
            counts[(int) (Math.random() * 10)]++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.printf("Number %d appears %d times\n", i, counts[i]);
        }
    }
}
