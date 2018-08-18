/**
 * (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates two integers and prompts the user
 * to enter the sum of these two integers. Revise the program to generate three single-digit integers and prompt the
 * user to enter the sum of these three integers.
 *
 * Created by Sven on 08/18/18.
 */
package Chapter03;

import java.util.Scanner;

public class Exercise0302_Game_add_three_numbers {
    public static void main(String[] args) {
        int number1, number2, number3;
        // Method 1: Generate three single-digit integers
//        number1 = (int) (System.currentTimeMillis() % 10);
//        number2 = (int) (System.currentTimeMillis() / 7 % 10);
//        number3 = (int) (System.currentTimeMillis() / 70 % 10);

        // Method 2: Generate three single-digit integers
        number1 = (int) (Math.random() * 9 + 1);
        number2 = (int) (Math.random() * 9 + 1);
        number3 = (int) (Math.random() * 9 + 1);

        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " +
                (number1 + number2 + number3 == answer));
    }
}
