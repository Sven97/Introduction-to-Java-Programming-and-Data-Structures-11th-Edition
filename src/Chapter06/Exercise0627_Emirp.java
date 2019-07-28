/**
 * (Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
 * whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so
 * 17 and 71 are emirps. Write a program that displays the first 120 emirps. Display
 * 10 numbers per line, separated by exactly one space, as follows:
 * 13 17 31 37 71 73 79 97 107 113
 * 149 157 167 179 199 311 337 347 359 389
 *
 * Created by Sven on 07/27/19.
 */
package Chapter06;

public class Exercise0627_Emirp {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; count < 120; i++) {
            // It's slow to compute the last five numbers
            if (isPrime(i) && isPrime(reverse(i))) {
                if (count != 0 && count % 10 == 0) {
                    System.out.println();
                }
                System.out.print(i + " ");
                count++;
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

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return reverse;
    }
}
