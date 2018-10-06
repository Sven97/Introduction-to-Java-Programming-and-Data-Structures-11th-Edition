/**
 * (Financial: compare costs) Suppose you shop for rice in two different packages.
 * You would like to write a program to compare the cost. The program prompts the
 * user to enter the weight and price of each package and displays the one with the
 * better price.
 *
 * Here is a sample run:
 * Enter weight and price for package 1: 50 24.59
 * Enter weight and price for package 2: 25 11.99
 * Package 2 has a better price.
 * Enter weight and price for package 1: 50 25
 * Enter weight and price for package 2: 25 12.5
 * Two packages have the same price.
 *
 * Created by Sven on 8/26/2018.
 */
package Chapter03;

import java.util.Scanner;

public class Exercise0333_Financial_compare_costs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        double cost1 = price1 / weight1;

        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        double cost2 = price2 / weight2;

        if (cost1 < cost2) {
            System.out.println("Package 1 has a better price.");
        } else if (cost1 > cost2) {
            System.out.println("Package 2 has a better price.");
        } else {
            System.out.println("The two packages have the same price.");
        }
    }
}
