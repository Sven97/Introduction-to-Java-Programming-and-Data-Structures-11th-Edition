/**
 * (Game: hangman) Write a hangman game that randomly generates a word and
 * prompts the user to guess one letter at a time, as presented in the sample run.
 * Each letter in the word is displayed as an asterisk. When the user makes a correct
 * guess, the actual letter is then displayed. When the user finishes a word, display
 * the number of misses and ask the user whether to continue to play with another
 * word. Declare an array to store words, as follows:
 *
 * // Add any words you wish in this array
 * String[] words = {"write", "that",...};
 *
 * (Guess) Enter a letter in word ******* > p
 * (Guess) Enter a letter in word p****** > r
 * (Guess) Enter a letter in word pr**r** > p
 * p is already in the word
 * (Guess) Enter a letter in word pr**r** > o
 * (Guess) Enter a letter in word pro*r** > g
 * (Guess) Enter a letter in word progr** > n
 * n is not in the word
 * (Guess) Enter a letter in word progr** > m
 * (Guess) Enter a letter in word progr*m > a
 * The word is program. You missed 1 time
 * Do you want to guess another word? Enter y or n>
 *
 * Created by Sven on 08/28/19.
 */
package Chapter07;

import java.util.Scanner;

public class Exercise0735_Game_hangman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Add any words you wish in this array
        String[] words = {"write", "that", "program"};

        String ans;
        do {
            char[] word = words[(int) (Math.random() * words.length)].toCharArray();

            char[] asterisks = new char[word.length];
            for (int i = 0; i < asterisks.length; i++) {
                asterisks[i] = '*';
            }

            int missedCount = 0;
            do {
                char guess = getGuess(asterisks);
                if (!isCorrectGuess(word, asterisks, guess)) {
                    missedCount++;
                }
            } while (!isWordFinish(asterisks));

            System.out.printf("The word is %s. You missed %d time\n", new String(word), missedCount);
            System.out.print("Do you want to guess another word? Enter y or n> ");
            ans = input.nextLine();
        } while (ans.charAt(0) == 'Y' || ans.charAt(0) == 'y');
    }

    public static boolean isCorrectGuess(char[] word, char[] blanks, char guess) {
        boolean correct = false;
        int message = 2;
        for (int i = 0; i < word.length; i++) {
            if (word[i] == guess) {
                correct = true;
                if (blanks[i] == guess)
                    message = 1;
                else {
                    blanks[i] = guess;
                    message = 0;
                }
            }
        }
        if (message > 0)
            print(message, guess);
        return correct;
    }

    public static boolean isWordFinish(char[] blanks) {
        for (char e : blanks) {
            if (e == '*')
                return false;
        }
        return true;
    }

    public static void print(int m, char guess) {
        System.out.print(guess);
        switch (m) {
            case 1:
                System.out.println(" is already in the word");
                break;
            case 2:
                System.out.println(" is not in the word");
        }
    }

    public static char getGuess(char[] asterisks) {
        Scanner input = new Scanner(System.in);
        System.out.print("(Guess) Enter a letter in word ");
        System.out.print(asterisks);
        System.out.print(" > ");
        String g = input.next();
        return g.charAt(0);
    }
}
