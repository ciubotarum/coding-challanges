package strings.codewars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class ShortestWord {
//    Simple, given a string of words, return the length of the shortest word(s).
//
//    String will never be empty and you do not need to account for different data types.

    public static int findShort(String s) {
        String[] words = s.split(" ");
        int shortestWord = Integer.MAX_VALUE;
        for (String word : words) {
            if (word.length() < shortestWord) {
                shortestWord = word.length();
            }
        }
        return shortestWord;

        // Another response
//        return Stream.of(s.split(" "))
//                .mapToInt(String::length)
//                .min()
//                .getAsInt();
    }

    public static class KataTest {
        @Test
        public void findShort() {
            assertEquals(3, ShortestWord.findShort("bitcoin take over the world maybe who knows perhaps"));
            assertEquals(3, ShortestWord.findShort("turns out random test cases are easier than writing out basic ones"));
            assertEquals(2, ShortestWord.findShort("Let's travel abroad shall we"));
        }

    }
}
