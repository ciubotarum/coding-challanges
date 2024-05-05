package strings;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class TasksForBeginners {

    //    Trolls are attacking your comment section!
//    A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
//    Your task is to write a function that takes a string and return a new string with all vowels removed.
//    For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
//    Note: for this kata y isn't considered a vowel.
    public static String disemvowel(String str) {
        String[] arr = str.split("");
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (!arr[i].equalsIgnoreCase("i") &&
                    !arr[i].equalsIgnoreCase("a") &&
                    !arr[i].equalsIgnoreCase("o") &&
                    !arr[i].equalsIgnoreCase("u") &&
                    !arr[i].equalsIgnoreCase("e")
            ) {
                newString.append(arr[i]);
            }
        }

        return newString.toString();
    }

//    Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). Jaden is also known for some of his philosophy that he delivers
//    via Twitter. When writing on Twitter, he is known for almost always capitalizing every word. For simplicity, you'll have to capitalize each word, check out how contractions are
//    expected to be in the example below.

    //    Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way
//    he originally typed them.
//
//    Example:
//
//    Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
//    Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
//    Note that the Java version expects a return value of null for an empty string or null.
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        } else {
            String[] arr = phrase.trim().split(" ");
            StringBuilder newString = new StringBuilder();
            String output = "";

            for (int i = 0; i < arr.length; i++) {
                if (i != arr.length - 1) {
                    output += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1) + " ";
                    newString.append(output);
                }
                if (i == arr.length - 1) {
                    output += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
                    newString.append(output);
                }

            }

            return output;
        }

    }

    //    Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits
//    to create the highest possible number.
//
//            Examples:
//    Input: 42145 Output: 54421
//
//    Input: 145263 Output: 654321
//
//    Input: 123456789 Output: 987654321
    public static int sortDesc(final int num) {
        int sort = 0;
        int number = num;

        List<Integer> list = new ArrayList<>();

        while (number != 0) {
            sort = number % 10;
            list.add(sort);
            number = number / 10;
        }
        Collections.sort(list, Collections.reverseOrder());

        int total = 0;
        for (int i : list) {
            total = 10 * total + i;
        }

        return total;

//
//        // Convert the integer to a string
//        String numStr = String.valueOf(num);
//
//        // Convert the string to a character array
//        char[] digits = numStr.toCharArray();
//
//        // Sort the character array in descending order
//        Arrays.sort(digits);
//        // Reverse the sorted array to get descending order
//        for (int i = 0; i < digits.length / 2; i++) {
//            char temp = digits[i];
//            digits[i] = digits[digits.length - i - 1];
//            digits[digits.length - i - 1] = temp;
//        }
//
//        // Convert the sorted character array back to a string
//        String sortedStr = new String(digits);
//
//        // Parse the string back to an integer
//        return Integer.parseInt(sortedStr);
    }

    //    Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
//
//    Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
//
//    If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
//    "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
//            "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
//            ""  -->  ""
    public static String order(String phrase) {
//        String[] arr = words.split(" ");
//        StringBuilder result = new StringBuilder("");
//        for (int i = 0; i < 10; i++) {
//            for (String s : arr) {
//                if (s.contains(String.valueOf(i))) {
//                    result.append(s + " ");
//                }
//            }
//        }
//        return result.toString().trim();
        if (phrase.isEmpty()) {
            return "";
        }

        String[] words = phrase.split(" ");

//        System.out.println(Arrays.asList(words));

        List<String> processedList = new ArrayList<>();
        Map<String, String> processingMap = new HashMap<>();
        for (String word : words) {
//            System.out.println(processString(word));
            String processed = processString(word);
            processedList.add(processed);

            processingMap.put(processed, word);
        }

        System.out.println(processedList);

        processedList = processedList.stream().sorted().collect(Collectors.toList());
//        System.out.println(processedList);
//
//        System.out.println(processingMap);

        List<String> result = new ArrayList<>();
        for (String processed : processedList) {
            String oldValue = processingMap.get(processed);
            result.add(oldValue);
        }

//        System.out.println(result);

//        String key = "2is";
//        System.out.println("key="+key+";value="+processingMap.get(key));

        return String.join(" ", result);
    }

    public static String processString(String word) {
        String newString = "";
        char[] charArray = word.toCharArray();
        for (char c : charArray) {
//            System.out.println(String.valueOf(c) + " " + String.valueOf(Character.isDigit(c)));
            if (Character.isDigit(c)) {
                newString = c + newString;
            } else {
                newString = newString + c;
            }
        }

        return newString;
    }

    public static String getDigit(String words) {
        return "";
    }

    //    You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even,
//    return the middle 2 characters.
//
//#Examples:
//
//            Kata.getMiddle("test") should return "es"
//
//            Kata.getMiddle("testing") should return "t"
//
//            Kata.getMiddle("middle") should return "dd"
//
//            Kata.getMiddle("A") should return "A"
//            #Input
//
//    A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000 in some test cases due to an error in the test cases). You do not need to test
//    for this. This is only here to tell you that you do not need to worry about your solution timing out.
//
//#Output
//
//    The middle character(s) of the word represented as a string.
    public static String getMiddle(String word) {
        int length = word.length();
        if (length % 2 == 0) {
            char firsChar = word.charAt((length - 1) / 2);
            char secondChar = word.charAt(length / 2);
            String middle = String.valueOf(firsChar) + String.valueOf(secondChar);
            return middle;
        } else {
            return word.charAt(length / 2) + "";
        }
    }

    public static void main(String[] args) {
        String str = "This website is for losers LOL!";
//        String phrase = "";
        int num = 1012;
        String phrase = "is2 Thi1s T4est 3a";
        String word = "test";

        // Troll
//        System.out.println(disemvowel(str));
        // Jaden Case
//        System.out.println(toJadenCase(phrase));
        //
//        System.out.println(sortDesc(num));
        //
//        System.out.println(order(phrase));
        //
        System.out.println(getMiddle(word));

    }
}
