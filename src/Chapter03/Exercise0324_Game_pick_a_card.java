/**
 * (Game: pick a card) Write a program that simulates picking a card from a deck of 52 cards. Your program should
 * display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of
 * the card.
 *
 * Here is a sample run of the program:
 * The card you picked is Jack of Hearts
 *
 * Created by Sven on 8/25/2018.
 */
package Chapter03;

public class Exercise0324_Game_pick_a_card {
    public static void main(String[] args) {
        int rankIndex = (int) (Math.random() * 13);
        String rankStr = "";
        int suitIndex = (int) (Math.random() * 4);
        String suitStr = "";

        switch (rankIndex) {
            case 0:
                rankStr = "Ace";
                break;
            case 10:
                rankStr = "Jack";
                break;
            case 11:
                rankStr = "Queen";
                break;
            case 12:
                rankStr = "King";
                break;
            default:
                rankStr = String.valueOf(rankIndex + 1);
        }

        switch (suitIndex) {
            case 0:
                suitStr = "Clubs";
                break;
            case 1:
                suitStr = "Diamonds";
                break;
            case 2:
                suitStr = "Hearts";
                break;
            case 3:
                suitStr = "Spades";
        }

        System.out.println("The card you picked is " + rankStr + " of " + suitStr);
    }
}
