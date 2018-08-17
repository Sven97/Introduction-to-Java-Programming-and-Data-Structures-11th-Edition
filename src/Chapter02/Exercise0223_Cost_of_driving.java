/**
 * (Cost of driving) Write a program that prompts the user to enter the distance to drive, the fuel efficiency of the
 * car in miles per gallon, and the price per gallon, and displays the cost of the trip.
 *
 * Here is a sample run:
 * Enter the driving distance: 900.5
 * Enter miles per gallon: 25.5
 * Enter price per gallon: 3.55
 * The cost of driving is $125.3
 *
 * Created by Sven on 08/17/18.
 */
package Chapter02;

import java.util.Scanner;

public class Exercise0223_Cost_of_driving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double drivingDistance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        double cost = drivingDistance / milesPerGallon * pricePerGallon;
        System.out.println("The cost of driving is $" + cost);
    }
}
