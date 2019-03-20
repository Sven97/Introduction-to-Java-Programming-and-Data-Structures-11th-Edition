/**
 * (Display four patterns using loops) Use nested loops that display the following
 * patterns in four separate programs:
 *
 * Pattern A
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *
 *
 * Pattern B
 * * * * * * *
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 *
 * Pattern C
 *           *
 *         * *
 *       * * *
 *     * * * *
 *   * * * * *
 * * * * * * *
 *
 * Pattern D
 * * * * * * *
 *   * * * * *
 *     * * * *
 *       * * *
 *         * *
 *           *
 *
 * Created by Sven on 3/19/2019.
 */
package Chapter05;

public class Exercise0518_Display_four_patterns_using_loops {
    public static void main(String[] args) {
        int numOfLines = 6;

        System.out.println("Pattern A");
        for (int i = 1; i <= numOfLines; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nPattern B");
        for (int i = 1; i <= numOfLines; i++) {
            for (int j = numOfLines - i + 1; j >0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nPattern C");
        for (int i = 1; i <= numOfLines; i++) {
            for (int j = numOfLines - i; j >0; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nPattern D");
        for (int i = 1; i <= numOfLines; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = numOfLines - i + 1; j >0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
