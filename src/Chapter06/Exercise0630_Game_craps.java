/**
 * (Game: craps) Craps is a popular dice game played in casinos. Write a program
 * to play a variation of the game, as follows:
 * Roll two dice. Each die has six faces representing values 1, 2, . . ., and 6, respectively.
 * Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
 * lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
 * (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
 * a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
 * Your program acts as a single player. Here are some sample runs.
 * You rolled 5 + 6 = 11
 * You win
 * You rolled 1 + 2 = 3
 * You lose
 * You rolled 4 + 4 = 8
 * point is 8
 * You rolled 6 + 2 = 8
 * You win
 * You rolled 3 + 2 = 5
 * point is 5
 * You rolled 2 + 5 = 7
 * You lose
 *
 * Created by Sven on 07/27/19.
 */
package Chapter06;

public class Exercise0630_Game_craps {
    public static void main(String[] args) {
        int point = rollDice();
        System.out.println(getStatus(point) ? "You win" : "You lose");
    }

    public static boolean getStatus(int point) {
        if (point == 7 || point == 11) {
            return true;
        } else if (point == 2 || point == 3 || point == 12) {
            return false;
        } else {
            System.out.println("point is " + point);
            int secondPoint = rollDice();
            while (true) {
                if (secondPoint == point) {
                    return true;
                } else if (secondPoint == 7) {
                    return false;
                } else {
                    System.out.println("point is " + secondPoint);
                    secondPoint = rollDice();
                }
            }
        }
    }


    public static int rollDice() {
        int dice1 = (int) (Math.random() * 6 + 1);
        int dice2 = (int) (Math.random() * 6 + 1);
        int point = dice1 + dice2;
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + point);
        return point;
    }
}
