/**
 * (Financial application: monetary units) Modify Listing 2.10, ComputeChange.
 * java, to display the nonzero denominations only, using singular words for single
 * units such as 1 dollar and 1 penny, and plural words for more than one unit such as
 * 2 dollars and 3 pennies.
 *
 * Created by Sven on 8/22/2018.
 */
package Chapter03;

import java.util.Scanner;

public class Exercise0307_Financial_application_monetary_units {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        System.out.print("    " + numberOfOneDollars);
        System.out.println(numberOfOneDollars == 1 ? " dollar" : " dollars");
        System.out.print("    " + numberOfQuarters);
        System.out.println(numberOfQuarters == 1 ? " quarter" : " quarters");
        System.out.print("    " + numberOfDimes);
        System.out.println(numberOfDimes == 1 ? " dime" : " dimes");
        System.out.print("    " + numberOfNickels);
        System.out.println(numberOfNickels == 1 ? " nickel" : " nickels");
        System.out.print("    " + numberOfPennies);
        System.out.println(numberOfPennies == 1 ? " penny" : " pennies");

    }
}
