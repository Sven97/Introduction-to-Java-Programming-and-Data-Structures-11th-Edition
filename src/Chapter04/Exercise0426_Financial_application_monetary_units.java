/**
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.java,
 * to fix the possible loss of accuracy when converting a float value to an int value.
 * Read the input as a string such as "11.56". Your program should extract the dollar
 * amount before the decimal point, and the cents after the decimal amount using the
 * indexOf and substring methods.
 *
 * Created by Sven on 11/2/2018.
 */
package Chapter04;

import java.util.Scanner;

public class Exercise0426_Financial_application_monetary_units {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount, for example 11.56: ");
        String amountStr = input.nextLine();
        int dollar = 0;
        int cent = 0;

        int postion = amountStr.indexOf('.');
        if (postion == -1) {
            dollar = Integer.parseInt(amountStr);
        } else {
            dollar = Integer.parseInt(amountStr.substring(0, postion));
            cent = Integer.parseInt((amountStr.substring(postion + 1) + "00").substring(0, 2));
        }

        int numberOfOneDollars = dollar;
        int remainingAmount = cent;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amountStr + " consists of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters ");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");
    }
}
