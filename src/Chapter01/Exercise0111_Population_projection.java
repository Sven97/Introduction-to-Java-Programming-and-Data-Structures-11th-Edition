/**
 *  (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
 *  ■ One birth every 7 seconds
 *  ■ One death every 13 seconds
 *  ■ One new immigrant every 45 seconds
 *  Write a program to display the population for each of the next five years. Assume the current population is
 *  312,032,486 and one year has 365 days. Hint: In Java, if two integers perform division, the result is an integer.
 *  The fractional part is truncated. For example,5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate
 *  result with the fractional part, one of the values involved in the division must be a number with a decimal point.
 *  For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 *
 *  Created by Sven on 08/16/18.
 */
package Chapter01;

public class Exercise0111_Population_projection {
    public static void main(String[] args) {
        int secondsInYear = 365*24*60*60;
        double birthNumberInYear = secondsInYear/7.0;
        double deathNumberInYear = secondsInYear/13.0;
        double immigrantNumberInYear = secondsInYear/45;
        double population = 312032486;

        for (int i = 0; i < 5; i++) {
            population = population + birthNumberInYear -deathNumberInYear +immigrantNumberInYear;
            System.out.println("Year #"+ (i+1) +" Population: "+ (int)population);
        }
    }
}
