/**
 * (The Sieve of Eratosthenes) The Sieve of Eratosthenes is an algorithm that finds all
 * prime numbers up to a given limit, n. It works by creating an array of Booleans,
 * flag, of size n+1, initializing the array to true (assuming every number is a
 * prime number in the beginning), and iteratively traversing the numbers from 2
 * to n, setting the values of indices that are multiples of other numbers to false.
 * Write a program using the algorithm above, and display all the prime numbers
 * up to 50.
 *
 * Created by Sven on 08/05/19.
 */
package Chapter07;

public class Exercise0706_The_Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        final int NUM_LIMIT = 50;
        boolean[] flags = new boolean[NUM_LIMIT];
        for (int i = 0; i < flags.length; i++) {
            flags[i] = true;
        }

        for (int i = 2; i < flags.length; i++) {
            if (flags[i] == true) {
                for (int j = 2; i * j < flags.length; j++) {
                    flags[i * j] = false;
                }
            }
        }

        for (int i = 2; i < flags.length; i++) {
            if (flags[i] == true) {
                System.out.println(i);
            }
        }
    }
}
