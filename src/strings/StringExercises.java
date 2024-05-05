package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    //    Return true if the given string contains between 1 and 3 'e' chars.
//
//    stringE("Hello") → true
//    stringE("Heelle") → true
//    stringE("Heelele") → false
    public static boolean stringE(String str) {
        int number = 0;

        for (char element : str.toCharArray()) {
            if (element == 'e') {
                number++;
            }
        }
        if (number >= 1 && number <= 3) {
            return true;
        }

        return false;

    }

    //    Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.
//
//            endUp("Hello") → "HeLLO"
//    endUp("hi there") → "hi thERE"
//    endUp("hi") → "HI"
    public static String endUp(String str) {
        int length = str.length();

        if (length < 4) {
            return str.toUpperCase();
        } else {
            String end = str.substring(length - 3, length).toUpperCase();
            return str.substring(0, length - 3) + end;
        }

    }


    //    Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
//
//    everyNth("Miracle", 2) → "Mrce"
//    everyNth("abcdefg", 2) → "aceg"
//    everyNth("abcdefg", 3) → "adg"
    public static String everyNth(String str, int n) {
        String[] arr = str.split("");
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (i % n == 0) {
                System.out.println(arr[i]);
                newString.append(arr[i]);
            }
        }

        return newString.toString();
    }

    //    Given a string and a non-negative int n, return a larger string that is n copies of the original string.
//
//            stringTimes("Hi", 2) → "HiHi"
//    stringTimes("Hi", 3) → "HiHiHi"
//    stringTimes("Hi", 1) → "Hi"
    public static String stringTimes(String str, int n) {
//        return str.repeat(n);
        StringBuilder builder = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            builder.append(str);
        }
        String newString = builder.toString();
        return newString;
    }


    //    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3.
    //    Return n copies of the front;
//
//    frontTimes("Chocolate", 2) → "ChoCho"
//    frontTimes("Chocolate", 3) → "ChoChoCho"
//    frontTimes("Abc", 3) → "AbcAbcAbc"
    public static String frontTimes(String str, int n) {
        StringBuilder builder = new StringBuilder(n);

        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                builder.append(str);
            }
            String newString = builder.toString();
            return newString;
        } else {
            for (int i = 0; i < n; i++) {
                builder.append(str.substring(0, 3));
            }
            String newString = builder.toString();
            return newString;
        }
    }

    //    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
//
//    countXX("abcxx") → 1
//    countXX("xxx") → 2
//    countXX("xxxx") → 3
    public static int countXX(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            String newString = str.substring(i, i + 2);
            if (newString.equals("xx")) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String str = "xxxx";
        int n = 3;

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
//        System.out.println(startOz(str));
        // String contains till 3 "e" chars
//        System.out.println(stringE(str));
        // Last 3 characters to uppercase
//        System.out.println(endUp(str));
        // every N-th
//        System.out.println(everyNth(str, n));
        // String repeat
//        System.out.println(stringTimes(str, n));
        //
//        System.out.println(frontTimes(str, n));
        //
        System.out.println(countXX(str));
    }
}
