/**
 * (Cost of shipping) A shipping company uses the following function to calculate the cost (in dollars) of shipping
 * based on the weight of the package (in pounds).
 * c(w)={
 * 3.5, if 0 < w <= 1
 * 5.5, if 1 < w <= 3
 * 8.5, if 3 < w <= 10
 * 10.5, if 10 < w <= 20
 *
 * Write a program that prompts the user to enter the weight of the package and display the shipping cost. If the weight
 * is greater than 50, display a message "the package cannot be shipped."
 *
 * Created by Sven on 8/23/2018.
 */
package Chapter03;

import java.util.Scanner;

public class Exercise0318_Cost_of_shipping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of the package (in pounds): ");
        double weight = input.nextDouble();

        if (weight <= 0) {
            System.out.println("Enter a positive number.");
        } else if (weight <= 1) {
            System.out.println("The cost (in dollars): 3.5");
        } else if (weight <= 3) {
            System.out.println("The cost (in dollars): 5.5");
        } else if (weight <= 10) {
            System.out.println("The cost (in dollars): 8.5");
        } else if (weight <= 20) {
            System.out.println("The cost (in dollars): 10.5");
        } else if (weight <= 50) {
            System.out.println("It cannot be calculated because the function is not available.");
        } else {
            System.out.println("The package cannot be shipped.");
        }
    }
}
