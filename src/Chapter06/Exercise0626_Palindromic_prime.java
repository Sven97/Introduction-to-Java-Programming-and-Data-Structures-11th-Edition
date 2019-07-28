/**
 * (Palindromic prime) A palindromic prime is a prime number and also palindromic.
 * For example, 131 is a prime and also a palindromic prime, as are 313 and 757.
 * Write a program that displays the first 120 palindromic prime numbers. Display
 * 10 numbers per line, separated by exactly one space, as follows:
 * 2 3 5 7 11 101 131 151 181 191
 * 313 353 373 383 727 757 787 797 919 929
 *
 * Created by Sven on 07/27/19.
 */
package Chapter06;

public class Exercise0626_Palindromic_prime {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; count < 120; i++) {
            // It's slow to compute the last five numbers
            if (isPrime(i) && isPalindrome(i)) {
                if (count != 0 && count % 10 == 0) {
                    System.out.println();
                }
                System.out.print(i + " ");
                count++;
            }
        }
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

    /**
     * Check whether number is palindromic
     */
    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return reverse;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
