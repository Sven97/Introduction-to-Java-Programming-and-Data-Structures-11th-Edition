/**
 * (Display current date and time) Listing 2.7, ShowCurrentTime.java, displays the
 * current time. Revise this example to display the current date and time. The calendar
 * example in Listing 6.12, PrintCalendar.java, should give you some ideas on
 * how to find the year, month, and day.
 *
 * Created by Sven on 07/23/19.
 */
package Chapter06;

public class Exercise0624_Display_current_date_and_time {
    public static void main(String[] args) {
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        // Obtain the total days. ADD TODAY!
        long totalDays = totalHours / 24 + 1;

        // Compute the current year
        int currentYear = getCurrentYear(totalDays);

        // Compute the days in current year
        int daysInCurrentYear = getDaysInCurrentYear(currentYear, totalDays);

        // Compute the current month
        int currentMonth = getCurrentMonth(currentYear, daysInCurrentYear);

        // Compute the current day
        int currentDay = getCurrentDay(currentYear, currentMonth, daysInCurrentYear);

        // Compute the current day in the week
        int currentDayOfTheWeek = (getStartDay(currentYear, currentMonth) + currentDay) % 7;

        // Display results
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
        System.out.println("Today is "
                + getDayName(currentDayOfTheWeek) + " "
                + getMonthName(currentMonth) + " "
                + currentDay + ", "
                + currentYear);

    }

    /**
     * Get current year based on total days since jan 1, 1970
     */
    public static int getCurrentYear(long totalDays) {
        int dayCount = 0;
        int year = 1970;
        while (dayCount < totalDays) {
            dayCount += isLeapYear(year) ? 366 : 365;
            year++;
        }
        return year - 1;
    }

    /**
     * Get days number in the current year
     */
    public static int getDaysInCurrentYear(int currentYear, long totalDays) {
        int numberOfLeapYearsSince1970 = 0;
        for (int i = 1970; i < currentYear; i++) {
            if (isLeapYear(i)) {
                numberOfLeapYearsSince1970++;
            }
        }
        return (int) (totalDays - numberOfLeapYearsSince1970) % 365;
    }

    /**
     * Get current month based on total days since jan 1, 1970 and year
     */
    public static int getCurrentMonth(int currentYear, int daysInCurrentYear) {
        int dayCount = 0;
        int currentMonth = 0;
        while (currentMonth <= 12 && dayCount < daysInCurrentYear) {
            dayCount += getNumberOfDaysInMonth(currentYear, currentMonth);
            currentMonth++;
        }
        return currentMonth - 1;
    }


    /**
     * Get current day
     */
    public static int getCurrentDay(int currentYear, int currentMonth, int daysInCurrentYear) {
        int daysCount = 0;
        for (int i = 1; i < currentMonth; i++) {
            daysCount += getNumberOfDaysInMonth(currentYear, i);
        }
        return daysInCurrentYear - daysCount;
    }

    /**
     * Get the start day of month/1/year
     */
    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        // Get total number of days from 1/1/1800 to month/1/year
        int totalNumberOfDays = getTotalNumberOfDays(year, month);

        // Return the start day for month/1/year
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    /**
     * Get the total number of days since January 1, 1800
     */
    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;

        // Get the total days from 1800 to 1/1/year
        for (int i = 1800; i < year; i++)
            if (isLeapYear(i))
                total = total + 366;
            else total = total + 365;

        // Add days from Jan to the month prior to the calendar month
        for (int i = 1; i < month; i++)
            total = total + getNumberOfDaysInMonth(year, i);

        return total;
    }

    /**
     * Get the number of days in a month
     */
    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2)
            return isLeapYear(year) ? 29 : 28;

        return 0; // If month is incorrect
    }

    /**
     * Determine if it is a leap year
     */
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
        }
        return monthName;
    }

    public static String getDayName(int dayOfWeek) {
        String dayName = "";
        switch (dayOfWeek) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 0:
                dayName = "Saturday";
                break;
        }
        return dayName;
    }
}
