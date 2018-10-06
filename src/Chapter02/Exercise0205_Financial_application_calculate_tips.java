/**
 * (Financial application: calculate tips) Write a program that reads the subtotal
 * and the gratuity rate and then computes the gratuity and total. For example, if the
 * user enters 10 for subtotal and 12% for gratuity rate, the program displays $1.2
 * as gratuity and $11.2 as total.
 *
 * Here is a sample run:
 * Enter the subtotal and a gratuity rate: 10 12
 * The gratuity is $1.2 and total is $11.2
 *
 * Created by Sven on 8/17/2018.
 */
package Chapter02;

import java.util.Scanner;

public class Exercise0205_Financial_application_calculate_tips {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble() / 100.0;

        double gratuity = subtotal * gratuityRate;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}
