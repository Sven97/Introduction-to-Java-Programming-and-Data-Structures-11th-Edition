/**
 * (Math: combinations) Write a program that displays all possible combinations
 * for picking two numbers from integers 1 to 7. Also display the total number of
 * all combinations.
 *
 * 1 2
 * 1 3
 * ...
 * ...
 * The total number of all combinations is 21
 *
 * Created by Sven on 06/05/19.
 */
package Chapter05;

public class Exercise0543_Math_combinations {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 8; i++) {
            for (int j = i + 1; j < 8; j++) {
                System.out.println(i + " " + j);
                count++;
            }
        }
        System.out.println("The total number of all combinations is " + count);
    }
}
