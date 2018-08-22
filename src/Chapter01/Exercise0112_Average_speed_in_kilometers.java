/**
 * (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. Write a program
 * that displays the average speed in kilometers per hour. (Note that 1 mile is 1.6 kilometers.)
 *
 * Created by Sven on 8/16/2018.
 */
package Chapter01;

public class Exercise0112_Average_speed_in_kilometers {
    public static void main(String[] args) {
        System.out.println("The average speed is " + (24 * 1.6 / (1 + 40.0 / 60 + 35.0 / 60 / 60)) + " km/h");
    }
}
