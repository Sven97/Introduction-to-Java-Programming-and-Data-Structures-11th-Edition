/**
 * (Math: pentagonal numbers) A pentagonal number is defined as n(3n-1)/2 for
 * n = 1 , 2 , …, and so on. Therefore, the first few numbers are 1, 5, 12, 22,
 * . . . . Write a method with the following header that returns a pentagonal
 * number:
 * public static int getPentagonalNumber(int n)
 * For example, getPentagonalNumber(1) returns 1 and getPentagonalNumber(
 * 2) returns 5. Write a test program that uses this method to display the
 * first 100 pentagonal numbers with 10 numbers on each line. Use the %7d format
 * to display each number.
 *
 * Created by Sven on 06/16/19.
 */
package Chapter06;

public class Exercise0601_Math_pentagonal_numbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%6d", getPentagonalNumber(i));
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
