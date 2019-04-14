/**
 * (Decimal to binary) Write a program that prompts the user to enter a decimal
 * integer then displays its corresponding binary value. Don’t use Java’s Integer
 * .toBinaryString(int) in this program.
 *
 * Created by Sven on 4/14/2019.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0537_Decimal_to_binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int originalNum = input.nextInt();
        int decNum = originalNum;
        String binStr = "";

        while (decNum > 0) {
            binStr = decNum % 2 + binStr; // Padding the binary string in reverse order
            decNum = decNum / 2;
        }
        System.out.println("Binary representation of " + originalNum + ": " + binStr);
    }
}
