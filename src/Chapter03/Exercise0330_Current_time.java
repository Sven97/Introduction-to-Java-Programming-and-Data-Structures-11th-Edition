/**
 * (Current time) Revise Programming Exercise 2.8 to display the hour using a
 * 12-hour clock.
 *
 * Here is a sample run:
 * Enter the time zone offset to GMT: -5
 * The current time is 4:50:34 AM
 *
 * Created by Sven on 8/26/2018.
 */
package Chapter03;

import java.util.Scanner;

public class Exercise0330_Current_time {
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

        String currentStr = (currentHour >= 12) ? ((currentHour - 12) + ":" + currentMinute + ":" + currentSecond + " PM") :
                ((currentHour - 12) + ":" + currentMinute + ":" + currentSecond + " AM");
        System.out.println("The current time is " + currentStr);
    }
}
