/**
 * (Game: chance of winning at craps) Revise Exercise 6.30 to run it 15,000 times
 * and display the number of winning games.
 *
 * Created by Sven on 07/27/19.
 */
package Chapter06;

public class Exercise0632_Game_chance_of_winning_at_craps {
    public static void main(String[] args) {
        int winCount = 0;
        int numOfTrail = 15000;
        for (int i = 0; i < 15000; i++) {
            int point = rollDice();
            if (getStatus(point)) {
                System.out.println("You win");
                winCount++;
            } else {
                System.out.println("You lose");
            }
        }

        System.out.println("\nYou won " + winCount + " times in " + numOfTrail + " trails");

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
