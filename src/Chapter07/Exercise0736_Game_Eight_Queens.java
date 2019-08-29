/**
 * (Game: Eight Queens) The classic Eight Queens puzzle is to place eight queens
 * on a chessboard such that no two queens can attack each other (i.e., no two queens
 * are on the same row, same column, or same diagonal). There are many possible
 * solutions. Write a program that displays one such solution. A sample output is
 * shown below:
 *
 * |Q| | | | | | | |
 * | | | | |Q| | | |
 * | | | | | | | |Q|
 * | | | | | |Q| | |
 * | | |Q| | | | | |
 * | | | | | | |Q| |
 * | |Q| | | | | | |
 * | | | |Q| | | | |
 *
 * ref:https://introcs.cs.princeton.edu/java/23recursion/Queens.java.html
 * Created by Sven on 08/29/19.
 */
package Chapter07;

public class Exercise0736_Game_Eight_Queens {
    public static void main(String[] args) {
        enumerate(8);
    }

    /***************************************************************************
     * Return true if queen placement q[n] does not conflict with
     * other queens q[0] through q[n-1]
     ***************************************************************************/
    public static boolean isConsistent(int[] q, int n) {
        for (int i = 0; i < n; i++) {
            if (q[i] == q[n]) return false;   // same column
            if ((q[i] - q[n]) == (n - i)) return false;   // same major diagonal
            if ((q[n] - q[i]) == (n - i)) return false;   // same minor diagonal
        }
        return true;
    }

    /***************************************************************************
     * Prints n-by-n placement of queens from permutation q in ASCII.
     ***************************************************************************/
    public static void printQueens(int[] q) {
        int n = q.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("|");
                if (q[i] == j) System.out.print("Q");
                else System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println();
    }


    /***************************************************************************
     *  Try all permutations using backtracking
     ***************************************************************************/
    public static void enumerate(int n) {
        int[] a = new int[n];
        enumerate(a, 0);
    }

    public static void enumerate(int[] q, int k) {
        int n = q.length;
        if (k == n) printQueens(q);
        else {
            for (int i = 0; i < n; i++) {
                q[k] = i;
                if (isConsistent(q, k)) enumerate(q, k + 1);
            }
        }
    }
}
