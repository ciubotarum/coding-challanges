package arrays.lists;

import java.util.Arrays;

public class Reflections {
//    "Point reflection" or "point symmetry" is a basic concept in geometry where a given point, P, at a given position relative to a mid-point, Q has a corresponding point, P1,
//    which is the same distance from Q but in the opposite direction.
//
//    Task
//    Given two points P and Q, output the symmetric point of point P about Q. Each argument is a two-element array of integers representing the point's X and Y coordinates.
//    Output should be in the same format, giving the X and Y coordinates of point P1. You do not have to validate the input.

    public static int[] reflectPoint(int[] p, int[] q) {
        int[] p1 = new int[2];
        p1[0] = 2 * q[0] - p[0];
        p1[1] = 2 * q[1] - p[1];

        return p1;
    }

    public static void main(String[] args) {
        int[] p = {2, 6};
        int[] q = {-2, -6};

        System.out.println(Arrays.toString(reflectPoint(p, q)));
    }
}
