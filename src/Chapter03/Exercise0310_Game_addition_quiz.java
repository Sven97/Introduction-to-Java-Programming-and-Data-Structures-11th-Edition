/**
 * (Game: multiplication quiz) Listing 3.3, SubtractionQuiz.java, randomly generates
 * a subtraction question. Revise the program to randomly generate a multiplication
 * question with two integers less than 1000.
 *
 * Created by Sven on 8/22/2018.
 */
package Chapter03;

import java.util.Scanner;

public class Exercise0310_Game_addition_quiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 100 + 1);
        int number2 = (int) (Math.random() * 100 + 1);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (number1 + number2 == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
        }
    }
}
