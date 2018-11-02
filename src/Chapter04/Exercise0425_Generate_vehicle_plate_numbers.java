/**
 * (Generate vehicle plate numbers) Assume that a vehicle plate number consists of
 * three uppercase letters followed by four digits. Write a program to generate a plate
 * number.
 * Created by Sven on 11/2/2018.
 */
package Chapter04;

public class Exercise0425_Generate_vehicle_plate_numbers {
    public static void main(String[] args) {
        StringBuilder vehiclePlateNumber = new StringBuilder();
        vehiclePlateNumber.append((char) (Math.random() * 26 + 'A'));
        vehiclePlateNumber.append((char) (Math.random() * 26 + 'A'));
        vehiclePlateNumber.append((char) (Math.random() * 26 + 'A'));
        vehiclePlateNumber.append((char) (Math.random() * 10 + '0'));
        vehiclePlateNumber.append((char) (Math.random() * 10 + '0'));
        vehiclePlateNumber.append((char) (Math.random() * 10 + '0'));
        vehiclePlateNumber.append((char) (Math.random() * 10 + '0'));
        System.out.println("The randomly generated vehicle plate number is " + vehiclePlateNumber);
    }
}
