/**
 * (Computing lcm) Write a method that returns the lcm (least common multiple) of
 * an unspecified number of integers. The method header is specified as follows:
 * public static int lcm(int... numbers)
 * Write a test program that prompts the user to enter five numbers, invokes the
 * method to find the lcm of these numbers, and displays the lcm.
 *
 * Created by Sven on 08/08/19.
 */
package Chapter07;

public class Exercise0714_Computing_lcm {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 3, 9, 4};
        System.out.println(lcm(numbers));
    }


    // Least Common Multiple　
    public static int lcm(int[] numbers) {
        int lcm_of_numbers = 1;
        int divisor = 2;

        while (true) {
            int counter = 0;
            boolean divisible = false;

            for (int i = 0; i < numbers.length; i++) {

                // lcm_of_array_elements (n1, n2, ... 0) = 0.
                // For negative number we convert into
                // positive and calculate lcm_of_array_elements.

                if (numbers[i] == 0) {
                    return 0;
                } else if (numbers[i] < 0) {
                    numbers[i] = numbers[i] * (-1);
                }
                if (numbers[i] == 1) {
                    counter++;
                }

                // Divide element_array by divisor if complete
                // division i.e. without remainder then replace
                // number with quotient; used for find next factor
                if (numbers[i] % divisor == 0) {
                    divisible = true;
                    numbers[i] = numbers[i] / divisor;
                }
            }

            // If divisor able to completely divide any number
            // from array multiply with lcm_of_array_elements
            // and store into lcm_of_array_elements and continue
            // to same divisor for next factor finding.
            // else increment divisor
            if (divisible) {
                lcm_of_numbers = lcm_of_numbers * divisor;
            } else {
                divisor++;
            }

            // Check if all element_array is 1 indicate
            // we found all factors and terminate while loop.
            if (counter == numbers.length) {
                return lcm_of_numbers;
            }
        }
    }
}
