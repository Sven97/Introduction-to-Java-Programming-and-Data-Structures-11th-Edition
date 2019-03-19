/**
 * (Find the largest n such that n2 < 12,000) Use a while loop to find the largest
 * integer n such that n2 is less than 12,000.
 *
 * Created by Sven on 3/19/2019.
 */
package Chapter05;

public class Exercise0513_Find_the_largest_n_such_that_n2_smaller_than_12000 {
    public static void main(String[] args) {
        int num = 0;
        while (Math.pow(num, 2) < 12000) {
            num++;
        }
        num--;
        System.out.println(num + " is the largest number such that n^2 < 12,000");
    }
}
