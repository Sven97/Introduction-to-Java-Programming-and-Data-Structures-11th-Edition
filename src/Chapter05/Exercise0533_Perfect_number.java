/**
 * (Perfect number) A positive integer is called a perfect number if it is equal to the
 * sum of all of its positive divisors, excluding itself. For example, 6 is the first perfect
 * number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. There
 * are four perfect numbers 6 10,000. Write a program to find all these four numbers.
 *
 * Created by Sven on 3/27/2019.
 */
package Chapter05;

public class Exercise0533_Perfect_number {
    public static void main(String[] args) {
        System.out.println("The four perfect numbers<10,000: ");
        for (int i = 1; i <= 10000; i++) {
            int number = i;
            int divisor = i;
            int sumOfDivisors = 0;
            while (divisor > 0) {
                if (number % divisor == 0 && number != divisor) {
                    sumOfDivisors += divisor;
                }
                divisor--;
            }
            if (number == sumOfDivisors){
                System.out.print(number+" ");
            }
        }
    }
}
