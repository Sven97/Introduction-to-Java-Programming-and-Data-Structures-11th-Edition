/**
 * (Simulation: coupon collector’s problem) Coupon collector is a classic statistics
 * problem with many practical applications. The problem is to repeatedly pick
 * objects from a set of objects and find out how many picks are needed for all the
 * objects to be picked at least once. A variation of the problem is to pick cards from
 * a shuffled deck of 52 cards repeatedly, and find out how many picks are needed
 * before you see one of each suit. Assume a picked card is placed back in the deck
 * before picking another. Write a program to simulate the number of picks needed
 * to get four cards from each suit and display the four cards picked (it is possible a
 * card may be picked twice). Here is a sample run of the program:
 * Queen of Spades
 * 5 of Clubs
 * Queen of Hearts
 * 4 of Diamonds
 * Number of picks: 12
 *
 * Created by Sven on 08/22/19.
 */
package Chapter07;

import java.util.Random;

public class Exercise0724_Simulation_coupon_collectors_problem {

    static String[] SUITS = {"Spades", "Clubs", "Hearts", "Diamonds"};
    static String[] RANKS = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public static void main(String[] args) {
        int numOfPicks = 0;
        int[] picks;
        do {
            picks = pickCards();
            numOfPicks++;
        } while (!isOneOfEachSuit(picks));

        for (int i = 0; i < picks.length; i++) {
            System.out.println(RANKS[picks[i] % 13] + " of " + SUITS[picks[i] / 13]);
        }
        System.out.println("Number of picks: " + numOfPicks);

    }

    public static int[] pickCards() {
        int[] deck = new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        int[] picks = new int[4];
        for (int i = 0; i < picks.length; i++) {
            // Shuffle the deck before picking
            int[] shuffledDeck = shuffleCards(deck);
            picks[i] = shuffledDeck[0]; // pick the first card of the shuffled deck
        }

        return picks;
    }

    public static boolean isOneOfEachSuit(int[] picks) {
        for (int i = 0; i < picks.length; i++) {
            for (int j = 0; j < picks.length; j++) {
                if (i != j && (picks[i] / 13 == picks[j] / 13))
                    return false;
            }
        }
        return true;
    }

    public static int[] shuffleCards(int[] array) {
        // Fisher–Yates shuffle
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }

}
