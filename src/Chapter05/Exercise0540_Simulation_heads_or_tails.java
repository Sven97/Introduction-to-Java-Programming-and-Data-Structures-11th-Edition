/**
 * (Simulation: heads or tails) Write a program that simulates flipping a coin two
 * millions times and displays the number of heads and tails.
 *
 * Created by Sven on 4/14/2019.
 */
package Chapter05;

public class Exercise0540_Simulation_heads_or_tails {
    public static void main(String[] args) {
        int headsCounter = 0, tailsCounter = 0;
        for (int i = 0; i < 2000000; i++) {
            int flip = (int) (Math.random() * 2);
            if (flip == 0) {
                headsCounter++;
            } else {
                tailsCounter++;
            }
        }
        System.out.println("Heads: " + headsCounter + " Tails: " + tailsCounter);
    }
}
