/**
 * (Convert pounds into kilograms) Write a program that converts pounds into kilograms. The program prompts the user to
 * enter a number in pounds, converts it to kilograms, and displays the result. One pound is 0.454 kilograms.
 *
 * Here is a sample run:
 * Enter a number in pounds: 55.5
 * 55.5 pounds is 25.197 kilograms
 *
 * Created by Sven on 08/16/18.
 */
package Chapter02;

import java.util.Scanner;

public class Exercise0204_Convert_pounds_into_kilograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        double kilograms = pounds * 0.454;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
