package strings.codewars;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LettersBestFriend {
//    Task
//    Given a string, return if all occurrences of a given letter are always immediately followed by the other given letter.
//
//            Worked Example
//            ("he headed to the store", "h", "e") ➞ True
//
//# All occurences of "h": ["he", "headed", "the"]
//            # All occurences of "h" have an "e" after it.
//            # Return True
//
//            ('abcdee', 'e', 'e') ➞ False
//
//# For first "e" we can get "ee"
//            # For second "e" we cannot have "ee"
//            # Return False
//    Examples
//            ("i found an ounce with my hound", "o", "u") ➞ True
//
//            ("we found your dynamite", "d", "y") ➞ False
    public static boolean bestFriend(String txt, char a, char b) {
        char[] arr = txt.toCharArray();

        for (int i = 1; i < txt.length(); i++) {
            if (arr[txt.length() - 1] == a) {
                return false;
            }
            if (arr[i-1] == a && arr[i] != b) {
                    return false;
            }
        }

        return true;
    }

    public static class SolutionTest {
        @Test
        void basicTestCases() {
//            assertTrue(
//                    LettersBestFriend.bestFriend("he headed to the store", 'h', 'e'),
//                    "for input: \"he headed to the store\", 'h', 'e'"
//            );
//            assertTrue(
//                    LettersBestFriend.bestFriend("i found an ounce with my hound", 'o', 'u'),
//                    "for input: \"i found an ounce with my hound\", 'o', 'u'"
//            );
//            assertTrue(
//                    LettersBestFriend.bestFriend("those were their thorns they said", 't', 'h'),
//                    "for input: \"those were their thorns they said\", 't', 'h'"
//            );
//            assertFalse(
//                    LettersBestFriend.bestFriend("we found your dynamite", 'd', 'y'),
//                    "for input: \"we found your dynamite\", 'd', 'y'"
//            );
//            assertFalse(
//                    LettersBestFriend.bestFriend("look they took the cookies", 'o', 'o'),
//                    "for input: \"look they took the cookies\", 'o', 'o'"
//            );
            assertFalse(LettersBestFriend.bestFriend("a test", 't', 'e'), "for input: \"a test\", 't', 'e'");
            assertFalse(LettersBestFriend.bestFriend("abcdee", 'e', 'e'), "for input: \"abcdee\", 'e', 'e'");
            assertFalse(LettersBestFriend.bestFriend("abcde", 'e', 'e'), "for input: \"abcde\", 'e', 'e'");
            assertTrue(LettersBestFriend.bestFriend("xaeaex", 'a', 'e'), "for input: \"xaeaex\", 'a', 'e'");
            assertTrue(LettersBestFriend.bestFriend("", 'x', 'y'), "for input: \"\", 'x', 'y'");
        }
    }
}
