/**
 * (Random number selector) Write a method that returns a random number from a
 * list of numbers passed in the argument. The method header is specified as follows:
 * public static int getRandom(int... numbers)
 *
 * Created by Sven on 08/08/19.
 */
package Chapter07;

public class Exercise0713_Random_number_selector {
    public static void main(String[] args) {
        int[] numbers = {141, 592, 653, 589, 793, 238, 462, 643, 383, 279};
        System.out.println("The generated random number is " + getRandom(numbers));
    }

    public static int getRandom(int[] numbers) {
        return numbers[(int) (Math.random() * numbers.length)];
    }
}
