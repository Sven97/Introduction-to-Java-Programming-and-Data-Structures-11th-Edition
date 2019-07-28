/**
 * (Current date and time) Invoking System.currentTimeMillis() returns the
 * elapsed time in milliseconds since midnight of January 1, 1970. Write a program
 * that displays the date and time. Here is a sample run:
 * Current date and time is May 16, 2012 10:34:23
 *
 * Created by Sven on 07/27/19.
 */
package Chapter06;


import static Chapter06.Exercise0624_Display_current_date_and_time.*;

public class Exercise0633_Current_date_and_time {
    // Same as Exercise0624
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        long totalDays = totalHours / 24 + 1;
        int currentYear = getCurrentYear(totalDays);
        int daysInCurrentYear = getDaysInCurrentYear(currentYear, totalDays);
        int currentMonth = getCurrentMonth(currentYear, daysInCurrentYear);
        int currentDay = getCurrentDay(currentYear, currentMonth, daysInCurrentYear);
        int currentDayOfTheWeek = (getStartDay(currentYear, currentMonth) + currentDay) % 7;
        System.out.println("Current date and time is "
                + getDayName(currentDayOfTheWeek) + " "
                + getMonthName(currentMonth) + " "
                + currentDay + ", "
                + currentYear + " "
                + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
