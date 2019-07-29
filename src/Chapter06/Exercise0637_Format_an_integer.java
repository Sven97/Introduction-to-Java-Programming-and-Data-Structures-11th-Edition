/**
 * (Format an integer) Write a method with the following header to format the integer
 * with the specified width.
 * public static String format(int number, int width)
 * The method returns a string for the number with one or more prefix 0s. The size of the
 * string is the width. For example, format(34, 4) returns 0034 and format(34,
 * 5) returns 00034. If the number is longer than the width, the method returns the
 * string representation for the number. For example, format(34, 1) returns 34.
 * Write a test program that prompts the user to enter a number and its width, and
 * displays a string returned by invoking format(number, width).
 *
 * Created by Sven on 07/28/19.
 */
package Chapter06;

import java.util.Scanner;

public class Exercise0637_Format_an_integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter a formatting width: ");
        int width = input.nextInt();
        System.out.println("The formatted number: " + format(number, width));
    }

    public static String format(int number, int width) {
        if (width <= getSize(number)) {
            return String.valueOf(number);
        } else {
            String result = "";
            for (int i = 0; i < width - getSize(number); i++) {
                result += "0";
            }
            result += String.valueOf(number);
            return result;
        }
    }

    public static int getSize(int d) {
        int size = 0;
        while (d > 0) {
            size++;
            d /= 10;
        }
        return size;
    }
}
