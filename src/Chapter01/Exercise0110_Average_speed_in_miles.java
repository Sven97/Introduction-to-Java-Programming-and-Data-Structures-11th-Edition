/**
 * (Average speed in miles) Assume that a runner runs 15 kilometers in 50 minutes
 * and 30 seconds. Write a program that displays the average speed in miles per hour.
 * (Note that 1 mile is 1.6 kilometers.)
 *
 * Created by Sven on 8/16/2018.
 */
package Chapter01;

public class Exercise0110_Average_speed_in_miles {
    public static void main(String[] args) {
        System.out.println("The average speed is " + (15 / 1.6) / (50.0 / 60 + 30.0 / 60 / 60) + " mph");
    }
}
