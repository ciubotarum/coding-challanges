package strings.codewars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class AnagramDetector {
    //    An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).
//
//    Note: anagrams are case insensitive
//
//    Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.
//
//            Examples
//     "foefet" is an anagram of "toffee"
//
//    "Buckethead" is an anagram of "DeathCubeK"
    public static boolean isAnagram(String test, String original) {
        if (test.length() != original.length()) {
            return false;
        }

        char[] testArray = test.toLowerCase().toCharArray();
        char[] originalArray = original.toLowerCase().toCharArray();

        Arrays.sort(testArray);
        Arrays.sort(originalArray);

        return Arrays.equals(testArray, originalArray);

        // Another way
//        return Stream.of(test.toLowerCase().split(""))
//                .sorted()
//                .collect(Collectors.joining())
//                .equals(
//                        Stream.of(original.toLowerCase()
//                                        .split(""))
//                                .sorted()
//                                .collect(Collectors.joining()));

    }

    public static class KataTests {
        @Test
        public void exampleTests() {
            AnagramDetector k = new AnagramDetector();

            assertEquals(true, k.isAnagram("foefet", "toffee"));
            assertEquals(true, k.isAnagram("Buckethead", "DeathCubeK"));
            assertEquals(true, k.isAnagram("Twoo", "Woot"));
            assertEquals(false, k.isAnagram("apple", "pale"));
        }
    }
}
