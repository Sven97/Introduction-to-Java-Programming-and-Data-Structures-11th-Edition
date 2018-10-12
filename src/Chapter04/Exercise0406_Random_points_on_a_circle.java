/**
 * (Random points on a circle) Write a program that generates three random points
 * on a circle centered at (0, 0) with radius 40 and displays three angles in a triangle
 * formed by these three points, as shown in Figure 4.4a. (Hint: Generate a random
 * angle a in radians between 0 and 2PI, as shown in Figure 4.4b and the point determined
 * by this angle is (r^x * cos(a), r^x * sin (a)).)
 *
 * Created by Sven on 10/12/2018.
 */
package Chapter04;

public class Exercise0406_Random_points_on_a_circle {
    public static void main(String[] args) {
        double radius = 40;
        double randomAngle;

        randomAngle = Math.random() * 2 * Math.PI;
        double pointAx = radius * Math.cos(randomAngle);
        double pointAy = radius * Math.sin(randomAngle);
        System.out.println("A:(" + pointAx + ", " + pointAy + ")");

        randomAngle = Math.random() * 2 * Math.PI;
        double pointBx = radius * Math.cos(randomAngle);
        double pointBy = radius * Math.sin(randomAngle);
        System.out.println("B:(" + pointBx + ", " + pointBy + ")");

        randomAngle = Math.random() * 2 * Math.PI;
        double pointCx = radius * Math.cos(randomAngle);
        double pointCy = radius * Math.sin(randomAngle);
        System.out.println("C:(" + pointCx + ", " + pointCy + ")");

        double distanceAB = Math.pow(Math.pow(pointAx - pointBx, 2) + Math.pow(pointAy - pointBy, 2), 0.5);
        double distanceBC = Math.pow(Math.pow(pointBx - pointCx, 2) + Math.pow(pointBy - pointCy, 2), 0.5);
        double distanceCA = Math.pow(Math.pow(pointCx - pointAx, 2) + Math.pow(pointCy - pointAy, 2), 0.5);

        double angleA = Math.toDegrees(Math.acos((Math.pow(distanceCA, 2) + Math.pow(distanceAB, 2) - Math.pow(distanceBC, 2)) /
                (2 * distanceCA * distanceAB)));
        System.out.println("Angle A = " + angleA);
        double angleB = Math.toDegrees(Math.acos((Math.pow(distanceAB, 2) + Math.pow(distanceBC, 2) - Math.pow(distanceCA, 2)) /
                (2 * distanceAB * distanceBC)));
        System.out.println("Angle B = " + angleB);
        double angleC = Math.toDegrees(Math.acos((Math.pow(distanceBC, 2) + Math.pow(distanceCA, 2) - Math.pow(distanceAB, 2)) /
                (2 * distanceBC * distanceCA)));
        System.out.println("Angle C = " + angleC);


    }
}
