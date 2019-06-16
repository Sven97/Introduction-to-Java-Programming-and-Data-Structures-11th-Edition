/**
 * (Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
 * isPrime(int number) method for testing whether a number is prime. Use this
 * method to find the number of prime numbers less than 10000.
 *
 * Created by Sven on 06/16/19.
 */
package Chapter06;

public class Exercise0610_Use_the_isPrime_Method {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 10001; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println("Total number of prime numbers from 1-10000 is " + count);
    }

    /**
     * Check whether number is prime
     */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // number is not a prime
            }
        }
        return true; // number is prime
    }
}
