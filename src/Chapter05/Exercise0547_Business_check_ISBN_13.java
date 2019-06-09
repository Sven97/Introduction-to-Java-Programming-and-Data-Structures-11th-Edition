/**
 * (Business: check ISBN-13) ISBN-13 is a new standard for identifying books. It uses
 * 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum, which is
 * calculated from the other digits using the following formula:
 * 10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12),10
 * If the checksum is 10, replace it with 0. Your program should read the input as a
 * string. Here are sample runs:
 *
 * Enter the first 12 digits of an ISBN-13 as a string: 978013213080
 * The ISBN-13 number is 9780132130806
 * Enter the first 12 digits of an ISBN-13 as a string: 978013213079
 * The ISBN-13 number is 9780132130790
 * Enter the first 12 digits of an ISBN-13 as a string: 97801320
 * 97801320 is an invalid input
 *
 * Created by Sven on 06/09/19.
 */
package Chapter05;

import java.util.Scanner;

public class Exercise0547_Business_check_ISBN_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN as integer: ");
        String originalNum = input.next();

        if (originalNum.length() != 12) {
            System.out.println(originalNum + " is an invalid input");
        } else {
            int sum = 0;
            for (int i = 0; i < originalNum.length(); i++) {
                sum += (i % 2 == 0) ? 3 * (originalNum.charAt(i) - 48) : (originalNum.charAt(i) - 48);
            }
            int checksum = (10 - sum % 10) % 10; // If the checksum is 10, replace it with 0, therefore % 10

            String ISBN13str = originalNum + checksum;

            System.out.print("The ISBN-13 number is " + ISBN13str);
        }
    }
}
