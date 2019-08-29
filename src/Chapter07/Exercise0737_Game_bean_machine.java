/**
 * (Game: bean machine) The bean machine, also known as a quincunx or the Galton
 * box, is a device for statistics experiments named after English scientist Sir
 * Francis Galton. It consists of an upright board with evenly spaced nails (or pegs)
 * in a triangular form, as shown in Figure 7.13.
 *
 * Balls are dropped from the opening of the board. Every time a ball hits a nail, it
 * has a 50% chance of falling to the left or to the right. The piles of balls are accumulated
 * in the slots at the bottom of the board.
 * Write a program that simulates the bean machine. Your program should prompt the
 * user to enter the number of the balls and the number of the slots in the machine.
 * Simulate the falling of each ball by printing its path. For example, the path for
 * the ball in Figure 7.13b is LLRRLLR and the path for the ball in Figure 7.13c is
 * RLRRLRR. Display the final buildup of the balls in the slots in a histogram. Here
 * is a sample run of the program:
 * (Hint: Create an array named slots. Each element in slots stores the number
 * of balls in a slot. Each ball falls into a slot via a path. The number of Rs in a path
 * is the position of the slot where the ball falls. For example, for the path LRLRLRR,
 * the ball falls into slots[4], and for the path RRLLLLL, the ball falls into
 * slots[2].)
 *
 * Enter the number of balls to drop: 5
 * Enter the number of slots in the bean machine: 8
 * LRLRLRR
 * RRLLLRR
 * LLRLLRR
 * RRLLLLL
 * LRLRRLR
 * O
 * O
 * OOO
 * Created by Sven on 08/29/19.
 */
package Chapter07;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Exercise0737_Game_bean_machine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int numOfBalls = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int numOfSlots = input.nextInt();

        int[] slots = new int[numOfSlots];
        for (int i = 0; i < numOfBalls; i++) {
            int rightCount = 0;
            for (int j = 0; j < numOfSlots - 1; j++) {
                boolean isRight = Math.random() > 0.5;
                System.out.print(isRight ? "R" : "L");
                if (isRight) {
                    rightCount++;
                }
            }
            System.out.println();
            slots[rightCount]++;
        }
        System.out.println();

        display(slots);
    }

    public static void display(int[] slots) {
        int maxHeight = slots[0];
        for (int i = 0; i < slots.length; i++) {
            if (slots[i] > maxHeight) {
                maxHeight = slots[i];
            }
        }

        for (int i = maxHeight; i > 0; i--) {
            for (int j = 0; j < slots.length; j++) {
                if (slots[j] == i) {
                    System.out.print("0");
                    slots[j]--;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
