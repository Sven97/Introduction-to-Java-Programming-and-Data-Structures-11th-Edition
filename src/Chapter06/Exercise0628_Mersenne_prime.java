/**
 * (Mersenne prime) A prime number is called a Mersenne prime if it can be written
 * in the form 2 p - 1 for some positive integer p. Write a program that finds all
 * Mersenne primes with p … 31 and displays the output as follows:
 * p 2^p – 1
 * 2 3
 * 3 7
 * 5 31
 * ...
 *
 * Created by Sven on 07/27/19.
 */
package Chapter06;

public class Exercise0628_Mersenne_prime {
    public static void main(String[] args) {
        System.out.println("p        2^p - 1");
        System.out.println("----------------");
        for (int p = 2; p <= 31; p++) {
            if (isPrime((int) Math.pow(2, p) - 1)) {
                System.out.printf("%-9d%d\n", p, (int) Math.pow(2, p) - 1);
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // number is not a prime
            }
        }
        return true; // number is prime
    }
}
