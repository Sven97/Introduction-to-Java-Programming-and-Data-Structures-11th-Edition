/**
 * (Generate random characters) Use the methods in RandomCharacter in Listing
 * 6.10 to print 200 uppercase letters and then 200 single digits, printing ten per line.
 *
 * Created by Sven on 07/28/19.
 */
package Chapter06;

public class Exercise0638_Generate_random_characters {
    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(getRandomUpperCaseLetter() + " ");
        }

        System.out.println("\n-------------------");

        for (int i = 0; i < 200; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.print(getRandomDigitCharacter() + " ");
        }
    }

    /**
     * Generate a random character between ch1 and ch2
     */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /**
     * Generate a random lowercase letter
     */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    /**
     * Generate a random uppercase letter
     */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    /**
     * Generate a random digit character
     */
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    /**
     * Generate a random character
     */
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}