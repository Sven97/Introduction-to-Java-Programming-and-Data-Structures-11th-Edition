/**
 * (Student major and status) Write a program that prompts the user to enter two
 * characters and displays the major and status represented in the characters. The first
 * character indicates the major and the second is number character 1, 2, 3, 4, which
 * indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
 * the following characters are used to denote the majors:
 * I: Information Management
 * C: Computer Science
 * A: Accounting
 *
 * Here is a sample run:
 * Enter two characters: I1
 * Information Management Freshman
 * Enter two characters: A3
 * Accounting Junior
 * Enter two characters: T3
 * Invalid input
 *
 * Created by Sven on 10/30/2018.
 */
package Chapter04;

import java.util.Scanner;

public class Exercise0418_Student_major_and_status {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String chars = input.next();
        char major = chars.charAt(0);
        char grade = chars.charAt(1);

        String majorName = "", gradeName = "";
        boolean isValid = true;
        switch (major) {
            case 'I':
                majorName = "Information Management";
                break;
            case 'C':
                majorName = "Computer Science";
                break;
            case 'A':
                majorName = "Accounting";
                break;
            default:
                isValid = false;
                break;
        }
        if (isValid != false) {
            switch (grade) {
                case '1':
                    gradeName = "Freshman";
                    break;
                case '2':
                    gradeName = "Sophomore";
                    break;
                case '3':
                    gradeName = "Junior";
                    break;
                case '4':
                    gradeName = "Senior";
                    break;
                default:
                    isValid = false;
                    break;
            }
        }
        if (isValid == false) {
            System.out.println("Invalid input");
        } else {
            System.out.println(majorName + " " + gradeName);
        }
    }
}
