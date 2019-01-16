/**
 * (Financial application: compute future tuition) Suppose that the tuition for a university
 * is $10,000 this year and increases 6% every year. In one year, the tuition
 * will be $10,600. Write a program that computes the tuition in ten years and the total
 * cost of four years' worth of tuition after the tenth year.
 *
 * Created by Sven on 1/16/2019.
 */
package Chapter05;

public class Exercise0507_Financial_application_compute_future_tuition {
    public static void main(String[] args) {
        double tuition = 10000;
        double fourYearsWorth = 0;
        for (int i = 0; i < 14; i++) {
            tuition *= 1.06;

            if (i == 10) {
                System.out.println("");
            }
            if (i >= 11) {
                fourYearsWorth += tuition;
            }

            if (i == 0 || i == 10) {
                System.out.printf("The tuition in %2d year is $%,.3f\n", (i + 1), tuition);
            } else {
                System.out.printf("%17d year is $%,.3f\n", (i + 1), tuition);
            }
        }
        System.out.printf("The cost of four years' worth of tuition after the tenth year is $%,.3f", fourYearsWorth);

    }
}
