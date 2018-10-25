/**
 * (Random character) Write a program that displays a random lowercase letter using
 * the Math.random() method.
 *
 * Created by Sven on 10/26/2018.
 */
package Chapter04;

public class Exercise0416_Random_character {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 26 + 97);
        char character = (char) randomNumber;
        System.out.println("The generated random lowercase letter is " + character);
    }
}
