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

    public static void main(String[] args) {
        int temp1 = 120;
        int temp2 = -1;
        int a = 12;
        int b = 99;
        int c = 10;

        // Temperature high and low
//        System.out.println(icyHot(temp1, temp2));
        // Values in range [10,20]
//        System.out.println(in1020(a, b));
        // Number in range [13,19]
//        System.out.println(hasTeen(a, b, c));
        // only one number need to be teen
        System.out.println(loneTeen(a, b));
    }
}
