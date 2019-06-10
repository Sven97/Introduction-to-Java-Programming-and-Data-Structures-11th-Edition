/**
 * (Print multiplication table) Write a program that uses for, while, and do-while loop
 * statements to display the multiplication table. Here is a sample run:
 *
 * Enter a string: Welcome to Java
 * 1*1= 1 2*1= 2 3*1= 3 4*1= 4 5*1= 5 6*1= 6 7*1= 7 8*1= 8 9*1= 9
 * 1*2= 1 2*2= 2 3*2= 6 4*2= 8 5*2=10 6*2=12 7*2=14 8*2=16 9*2=18
 * 1*3= 3 2*3= 6 3*3= 9 4*3=12 5*3=15 6*3=18 7*3=21 8*3=24 9*3=27
 * 1*4= 4 2*4= 8 3*4=12 4*4=16 5*4=20 6*4=24 7*4=28 8*4=32 9*4=36
 * 1*5= 5 2*5=10 3*5=15 4*5=20 5*5=25 6*5=30 7*5=35 8*5=40 9*5=45
 * 1*6= 6 2*6=12 3*6=18 4*6=24 5*6=30 6*6=36 7*6=42 8*6=48 9*6=54
 * 1*7= 7 2*7=14 3*7=21 4*7=28 5*7=35 6*7=42 7*7=49 8*7=56 9*7=63
 * 1*8= 8 2*8=16 3*8=24 4*8=32 5*8=40 6*8=48 7*8=56 8*8=64 9*8=72
 * 1*9= 9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81
 *
 * Created by Sven on 06/10/19.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0550_Print_multiplication_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // for loop
        System.out.println("\nPrint multiplication table using for loop");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d*%d=%2d ", i, j, i * j);
            }
            System.out.println();
        }

        // do-while loop
        System.out.println("\nPrint multiplication table using while loop");
        int i = 1, j = 1;
        while (i < 10) {
            while (j < 10) {
                System.out.printf("%d*%d=%2d ", i, j, i * j);
                j++;
            }
            System.out.println();
            i++;
            j = 1;
        }


        // do-while loop
        System.out.println("\nPrint multiplication table using do-while loop");
        i = 1;
        j = 1;
        do {
            do {
                System.out.printf("%d*%d=%2d ", i, j, i * j);
                j++;
            } while (j < 10);
            System.out.println();
            i++;
            j = 1;
        } while (i < 10);
    }
}
