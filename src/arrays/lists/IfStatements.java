package arrays.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IfStatements {
    //    Given two temperatures, return true if one is less than 0 and the other is greater than 100.
//
//
//    icyHot(120, -1) → true
//    icyHot(-1, 120) → true
//    icyHot(2, 120) → false
    public static boolean icyHot(int temp1, int temp2) {
        if (temp1 < 0 && temp2 > 100) {
            return true;
        }
        if (temp2 < 0 && temp1 > 100) {
            return true;
        }
        return false;
    }

    //    Given 2 int values, return true if either of them is in the range 10..20 inclusive.
//
//
//            in1020(12, 99) → true
//    in1020(21, 12) → true
//    in1020(8, 99) → false
    public static boolean in1020(int a, int b) {
        if (a >= 10 && a <= 20) {
            return true;
        }
        if (b >= 10 && b <= 20) {
            return true;
        }
        return false;
    }


    //    We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
//
//    hasTeen(13, 20, 10) → true
//    hasTeen(20, 19, 10) → true
//    hasTeen(20, 10, 13) → true
    public static boolean hasTeen(int a, int b, int c) {
        if (a >= 13 && a <= 19) {
            return true;
        }
        if (b >= 13 && b <= 19) {
            return true;
        }
        if (c >= 13 && c <= 19) {
            return true;
        }
        return false;
    }


    //    We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
//
//    loneTeen(13, 99) → true
//    loneTeen(21, 19) → true
//    loneTeen(13, 13) → false.
    public static boolean loneTeen(int a, int b) {
        return (a >= 13 && a <= 19) ^ (b >= 13 && b <= 19);
    }

    //    Given three int values, a b c, return the largest.
//
//    intMax(1, 2, 3) → 3
//    intMax(1, 3, 2) → 3
//    intMax(3, 2, 1) → 3
    public static int intMax(int a, int b, int c) {
        int[] list = {a, b, c};
        int max = Integer.MIN_VALUE;
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }


    //    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
//
//    close10(8, 13) → 8
//    close10(13, 8) → 8
//    close10(13, 7) → 0
    public static int close10(int a, int b) {
        if (Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        }
        if (Math.abs(a - 10) == Math.abs(b - 10)) {
            return 0;
        }
        return b;
    }


    //    Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
//
//    in3050(30, 31) → true
//    in3050(30, 41) → false
//    in3050(40, 50) → true
    public static boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        }
        if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
            return true;
        }
        return false;
    }


    //    Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
//
//    max1020(11, 19) → 19
//    max1020(19, 11) → 19
//    max1020(11, 9) → 11
    public static int max1020(int a, int b) {
        List<Integer> filtered = Stream.of(a, b)
                .filter(element -> element >= 10 && element <= 20)
                .collect(Collectors.toList());

        System.out.println(filtered);

        int max = Integer.MIN_VALUE;

        if (filtered.size() == 0) {
            return 0;
        } else {
            for (int i : filtered) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        }


    }

    //    Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
//
//    lastDigit(7, 17) → true
//    lastDigit(6, 17) → false
//    lastDigit(3, 113) → true
    public static boolean lastDigit(int a, int b) {
        if (a % 10 == b % 10) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int temp1 = 120;
        int temp2 = -1;
        int a = 17;
        int b = 117;
        int c = 10;

        // Temperature high and low
//        System.out.println(icyHot(temp1, temp2));
        // Values in range [10,20]
//        System.out.println(in1020(a, b));
        // Number in range [13,19]
//        System.out.println(hasTeen(a, b, c));
        // only one number need to be teen
//        System.out.println(loneTeen(a, b));
        // Max value
//        System.out.println(intMax(a, b, c));
        // Nearest value to 10
//        System.out.println(close10(a, b));
        // numbers in range [30,40] or [40,50]
//        System.out.println(in3050(a, b));
        // larger value in range [10,20]
//        System.out.println(max1020(a, b));
        // Last digit
        System.out.println(lastDigit(a, b));
    }
}
