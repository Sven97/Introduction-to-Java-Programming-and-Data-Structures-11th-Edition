/**
 * (Display numbers) Write a method that prints numbers using the following header:
 * public static void printNumbers(int num1, int num2, int
 * numberPerLine)
 * This method prints the characters between num1 and num2 with the specified
 * numbers per line. Write a test program that prints ten characters per line from 1
 * to 100. Numbers are separated by exactly one space.
 *
 * Created by Sven on 07/07/19.
 */
package Chapter06;

public class Exercise0612_Display_numbers {
    public static void main(String[] args) {
        printNumbers(1, 100, 10);
    }

    public static void printNumbers(int num1, int num2, int numberPerLine) {
        int count = 0;
        for (int i = num1; i <= num2; i++) {
            System.out.print(i + " ");
            count++;
            if (count % numberPerLine == 0) {
                System.out.println();
            }
        }
    }
}
