public class StringExercises {
    //    Given a string, return a new string where the first and last chars have been exchanged.
//
//    frontBack("code") → "eodc"
//    frontBack("a") → "a"
//    frontBack("ab") → "ba"
    public static String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }


    //    Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there.
    //    Return a new string which is 3 copies of the front.
//
//    front3("Java") → "JavJavJav"
//    front3("Chocolate") → "ChoChoCho"
//    front3("abc") → "abcabcabc"
    public static String front3(String str) {
        if (str.length() < 3) {
            return str + str + str;
        }
        return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
    }


    //    Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
//
//
//    backAround("cat") → "tcatt"
//    backAround("Hello") → "oHelloo"
//    backAround("a") → "aaa"
    public static String backAround(String str) {
        return str.charAt(str.length() - 1) + str.substring(0, str.length()) + str.charAt(str.length() - 1);
    }

    //    Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
//
//    or35(3) → true
//    or35(10) → true
//    or35(8) → false
    public static boolean or35(int n) {
        if (n % 3 == 0) {
            return true;
        }
        if (n % 5 == 0) {
            return true;
        }
        return false;
    }

    //    Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki".
//    If the string length is less than 2, use whatever chars are there.
//
//
//            front22("kitten") → "kikittenki"
//    front22("Ha") → "HaHaHa"
//    front22("abc") → "ababcab"
    public static String front22(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str + str + str;
        }
        return str.substring(0,2) + str.substring(0, str.length()) + str.substring(0,2);
    }


    public static void main(String[] args) {

        String str = "a";
        int n = 10;
        // Front Bach
//        System.out.println(frontBack(str));
        // Front 3
//        System.out.println(front3(str));
        // Back around
//        System.out.println(backAround(str));
        // Multiple of 3 and 5
//        System.out.println(or35(n));
        // Front 2 numbers
        System.out.println(front22(str));
    }
}
