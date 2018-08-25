/**
 * (Use the &&, || and ^ operators) Write a program that prompts the user to enter an integer and determines whether it
 * is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both.
 *
 * Here is a sample run of this program
 * Enter an integer: 10
 * Is 10 divisible by 5 and 6? false
 * Is 10 divisible by 5 or 6? true
 * Is 10 divisible by 5 or 6, but not both? true
 *
 * Created by Sven on 8/25/2018.
 */
package Chapter03;

import java.util.Scanner;

public class Exercise0326_Use_the_operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        boolean isDivAnd = (number % 5 == 0) && (number % 6 == 0);
        boolean isDivOr = (number % 5 == 0) || (number % 6 == 0);
        boolean isDivXor = (number % 5 == 0) ^ (number % 6 == 0);

        System.out.println("Is " + number + " divisible by 5 and 6? " + isDivAnd);
        System.out.println("Is " + number + " divisible by 5 or 6? " + isDivOr);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + isDivXor);
    }
}
