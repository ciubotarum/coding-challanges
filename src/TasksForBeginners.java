import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    public static void main(String[] args) {
        String str = "This website is for losers LOL!";
        String phrase = "";
        int num = 1012;

        // Troll
//        System.out.println(disemvowel(str));
        // Jaden Case
//        System.out.println(toJadenCase(phrase));
        //
        System.out.println(sortDesc(num));
    }
}
