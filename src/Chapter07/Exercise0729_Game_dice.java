/**
 * (Game: dice) Suppose three dice are thrown at random. Write a program that
 * shows all possible permutations or configurations of the three dice that yield the
 * sum of nine.
 *
 * Created by Sven on 08/24/19.
 */
package Chapter07;

public class Exercise0729_Game_dice {
    public static void main(String[] args) {
        // O(n^3)
        // can bu improved using Exercise 0728
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                for (int k = 1; k <= 6; k++) {
                    if (i + j + k == 9) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
}
