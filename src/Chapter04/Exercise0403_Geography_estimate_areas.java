/**
 * (Geography: estimate areas) Use the GPS locations for Atlanta, Georgia; Orlando,
 * Florida; Savannah, Georgia; and Charlotte, North Carolina in the figure in Section
 * 4.1 to compute the estimated area enclosed by these four cities. (Hint: Use the
 * formula in Programming Exercise 4.2 to compute the distance between two cities.
 * Divide the polygon into two triangles and use the formula in Programming Exercise
 * 2.19 to compute the area of a triangle.)
 *
 * Charlotte (35.2270869, -80.8431267)
 * Atlanta (33.7489954, -84.3879824)
 * Savannah (32.0835407, -81.0998342)
 * Orlando (28.5383355, -81.3792365)
 *
 * Created by Sven on 10/6/2018.
 */
package Chapter04;

public class Exercise0403_Geography_estimate_areas {
    public static void main(String[] args) {
        final double RADIUS_OF_THE_EARTH = 6371.01;
        double s;
        double chaX = 35.2270869;
        double chaY = -80.8431267;
        double atlX = 33.7489954;
        double atlY = -84.3879824;
        double savX = 32.0835407;
        double savY = -81.0998342;
        double orlX = 28.5383355;
        double orlY = -81.3792365;

        double distanceChaAtl = RADIUS_OF_THE_EARTH *
                Math.acos(Math.sin(Math.toRadians(chaX)) * Math.sin(Math.toRadians(atlX)) +
                        Math.cos(Math.toRadians(chaX)) * Math.cos(Math.toRadians(atlX)) *
                                Math.cos(Math.toRadians(chaY - atlY)));
        double distanceAtlOrl = RADIUS_OF_THE_EARTH *
                Math.acos(Math.sin(Math.toRadians(atlX)) * Math.sin(Math.toRadians(orlX)) +
                        Math.cos(Math.toRadians(atlX)) * Math.cos(Math.toRadians(orlX)) *
                                Math.cos(Math.toRadians(atlY - orlY)));
        double distanceOrlSav = RADIUS_OF_THE_EARTH *
                Math.acos(Math.sin(Math.toRadians(orlX)) * Math.sin(Math.toRadians(savX)) +
                        Math.cos(Math.toRadians(orlX)) * Math.cos(Math.toRadians(savX)) *
                                Math.cos(Math.toRadians(orlY - savY)));
        double distanceSavCha = RADIUS_OF_THE_EARTH *
                Math.acos(Math.sin(Math.toRadians(savX)) * Math.sin(Math.toRadians(chaX)) +
                        Math.cos(Math.toRadians(savX)) * Math.cos(Math.toRadians(chaX)) *
                                Math.cos(Math.toRadians(savY - chaY)));
        double distanceChaOrl = RADIUS_OF_THE_EARTH *
                Math.acos(Math.sin(Math.toRadians(chaX)) * Math.sin(Math.toRadians(orlX)) +
                        Math.cos(Math.toRadians(chaX)) * Math.cos(Math.toRadians(orlX)) *
                                Math.cos(Math.toRadians(chaY - orlY)));

        s = (distanceChaAtl + distanceAtlOrl + distanceChaOrl) / 2;
        double areaChaAtlOrl = Math.pow(s * (s - distanceChaAtl) * (s - distanceAtlOrl) * (s - distanceChaOrl), 0.5);
        s = (distanceOrlSav + distanceSavCha + distanceChaOrl) / 2;
        double areaChaOrlSav = Math.pow(s * (s - distanceOrlSav) * (s - distanceSavCha) * (s - distanceChaOrl), 0.5);

        double areaChaAtlOrlSav = areaChaAtlOrl + areaChaOrlSav;
        System.out.println("The estimated area enclosed by these four cities is " + areaChaAtlOrlSav);
    }
}
