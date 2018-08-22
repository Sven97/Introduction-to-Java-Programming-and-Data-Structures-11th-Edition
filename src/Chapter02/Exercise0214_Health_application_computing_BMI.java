/**
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of health on weight. It can be calculated by
 * taking your weight in kilograms and dividing by the square of your height in meters. Write a program that prompts the
 * user to enter a weight in pounds and height in inches and displays the BMI. Note that one pound is 0.45359237
 * kilograms and one inch is 0.0254 meters.
 *
 * Here is a sample run:
 * Enter weight in pounds: 95.5
 * Enter height in inches: 50
 * BMI is 26.8573
 *
 * Created by Sven on 8/17/2018.
 */
package Chapter02;

import java.util.Scanner;

public class Exercise0214_Health_application_computing_BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        double weightInKilograms = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;

        double BMI = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.println("BMI is " + BMI);
    }
}
