/**
 * (Decimal to octal) Write a program that prompts the user to enter a decimal
 * integer and displays its corresponding octal value. Don’t use Java’s Integer.
 * toOctalString(int) in this program.
 *
 * Created by Sven on 4/14/2019.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0538_Decimal_to_octal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int originalNum = input.nextInt();
        int decNum = originalNum;
        String octStr = "";

        while (decNum > 0) {
            octStr = decNum % 8 + octStr; // Padding the octal string in reverse order
            decNum = decNum / 8;
        }
        System.out.println("Binary representation of " + originalNum + ": " + octStr);
    }
}
