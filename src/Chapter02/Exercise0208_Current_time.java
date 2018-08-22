/**
 * (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays the current time in GMT. Revise the
 * program so that it prompts the user to enter the time zone offset to GMT and displays the time in the specified time
 * zone.
 *
 * Here is a sample run:
 * Enter the time zone offset to GMT: −5
 * The current time is 4:50:34
 *
 * Created by Sven on 8/17/2018.
 */
package Chapter02;

import java.util.Scanner;

public class Exercise0208_Current_time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int timeZone = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + timeZone) % 24;

        System.out.println("The Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
