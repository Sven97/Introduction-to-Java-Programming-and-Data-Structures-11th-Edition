/**
 * (Enter three countries) Write a program that prompts the user to enter three countries
 * and displays them in descending order.
 *
 * Here is a sample run:
 * Enter the first country: Germany
 * Enter the second country: France
 * Enter the third country: Switzerland
 * The three countries in descending order are Switzerland
 * Germany France
 *
 * Created by Sven on 11/2/2018.
 */
package Chapter04;

import java.util.Scanner;

public class Exercise0424_Enter_three_countries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first country: ");
        String country1 = input.nextLine();
        System.out.print("Enter the second country: ");
        String country2 = input.nextLine();
        System.out.print("Enter the third country: ");
        String country3 = input.nextLine();

        String temp;

        // This code can be optimized using Method
        if (country1.compareTo(country2) > 0) {
            temp = country1;
            country1 = country2;
            country2 = temp;
        }
        if (country2.compareTo(country3) > 0) {
            temp = country2;
            country3 = country2;
            country2 = temp;
        }
        if (country1.compareTo(country2) > 0) {
            temp = country1;
            country1 = country2;
            country2 = temp;
        }
        System.out.println("The three countries in descending order are " + country1 + country2 + country3);
    }
}
