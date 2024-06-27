package arrays.lists;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class WordSearch {

    //    Write a method that will search an array of strings for all strings that contain another string, ignoring
//    capitalization. Then return an array of the found strings.
//
//    The method takes two parameters, the query string and the array of strings to search, and returns an array.
//
//    If the string isn't contained in any of the strings in the array, the method returns an array containing a single
//    string: "Empty" (or Nothing in Haskell, or "None" in Python and C)
//
//    Examples
//    If the string to search for is "me", and the array to search is ["home", "milk", "Mercury", "fish"], the method
//    should return ["home", "Mercury"].
    static String[] findWord(String x, String[] y) {
        String[] matchingWords = Arrays.stream(y)
                .filter(word -> word.toLowerCase().contains(x))
                .toArray(String[]::new);


        if (matchingWords.length == 0) {
            return new String[]{"Empty"};
        } else {
            return matchingWords;
        }
    }

    public static class WordSearchTest {
        @Test
        public void test() {
            String[] test1 = {"lemonade", "limeade", "Yoo-Hoo", "root beer", "grapeade ", "water", "Mr. Pibb"};
            String[] test1results = {"lemonade", "limeade", "grapeade "};
            String[] test2results = {"Tin + Oxygen", "lox"};
            String[] test3results = {"Empty"};
            Assert.assertArrayEquals(test1results, WordSearch.findWord("ade", test1));
            String[] test2 = new String[320];
            for (int i = 0; i < 320; i++) {
                test2[i] = "o x";
            }
            test2[303] = "lox";
            test2[70] = "Tin + Oxygen";
            Assert.assertArrayEquals(test2results, WordSearch.findWord("ox", test2));
            Assert.assertArrayEquals(test3results, WordSearch.findWord("   ", test1));
        }
    }
}
