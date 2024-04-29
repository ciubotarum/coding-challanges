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
        return str.substring(0, 2) + str.substring(0, str.length()) + str.substring(0, 2);
    }

    //    Given a string, return true if the string starts with "hi" and false otherwise.
//
//
//            startHi("hi there") → true
//    startHi("hi") → true
//    startHi("hello hi") → false
    public static boolean startHi(String str) {
        if (str.startsWith("hi")) {
            return true;
        }
        return false;
    }


    //    Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
//
//
//            delDel("adelbc") → "abc"
//    delDel("adelHello") → "aHello"
//    delDel("adedbc") → "adedbc"
    public static String delDel(String str) {
        if (str.length() < 4) {
            return str;
        }
        if (str.substring(1, 4).equals("del")) {
            return str.charAt(0) + str.substring(4);
        }
        return str;
    }


    //    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
//
//    mixStart("mix snacks") → true
//    mixStart("pix snacks") → true
//    mixStart("piz snacks") → false
    public static boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (str.substring(1, 3).equals("ix")) {
            return true;
        }
        return false;
    }


    //    Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
//
//    startOz("ozymandias") → "oz"
//    startOz("bzoo") → "z"
//    startOz("oxx") → "o"
    public static String startOz(String str) {
        char o = 'o';
        char z = 'z';
        if (str.length() < 2) {
            if (str.equals("o")) {
                return "o";
            } else {
                return "";
            }
        }
        if (str.charAt(0) == o && str.charAt(1) == z) {
            return "oz";
        }
        if (str.charAt(0) == o && str.charAt(1) != z) {
            return "o";
        }
        if (str.charAt(0) != o && str.charAt(1) == z) {
            return "z";
        }
        return "";
    }

    public static void main(String[] args) {

        String str = "";
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
//        System.out.println(front22(str));
        // Start String with HI
//        System.out.println(startHi(str));
        // Deleting del starting at index 2
//        System.out.println(delDel(str));
        // String begins with "mix"
//        System.out.println(mixStart(str));
        // Print first two letter only if first is o and the second is z
        System.out.println(startOz(str));
    }
}
