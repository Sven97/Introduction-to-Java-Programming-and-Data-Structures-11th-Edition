/**
 * (Computer architecture: bit-level operations) A byte value is stored in 8 bits. Write
 * a program that prompts the user to enter a byte integer and displays the 8 bits for
 * the integer. Here are sample runs:
 *
 * Enter an integer: 5
 * The 8 bits are 00000101
 *
 * Enter an integer: –5
 * The 8 bits are 11111011
 *
 * (Hint: You need to use the bitwise right shift operator (>>) and the bitwise AND
 * operator (&), which are covered in Appendix G, Bitwise Operations.)
 *
 * Created by Sven on 06/05/19.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0544_Computer_architecture_bit_level_operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("he 8 bits are ");
        for (int i = 7; i >= 0; i--) {
            System.out.print((number >> i) & 1);
        }
    }
}
