package strings.leetcode;

import java.util.Arrays;
import java.util.List;

public class LengthOfLastWord {
//    Given a string s consisting of words and spaces, return the length of the last word in the string.
//
//    A word is a maximal
//            substring
//    consisting of non-space characters only.
//
//
//
//            Example 1:
//    Input: s = "Hello World"
//    Output: 5
//    Explanation: The last word is "World" with length 5.

//            Example 2:
//    Input: s = "   fly me   to   the moon  "
//    Output: 4
//    Explanation: The last word is "moon" with length 4.

//          Example 3:
//    Input: s = "luffy is still joyboy"
//    Output: 6
//    Explanation: The last word is "joyboy" with length 6.
    public static int lengthOfLastWord(String s) {
        List<String> words = Arrays.stream(s.trim().split(" ")).toList();
        return words.get(words.size() - 1).length();
    }

    public static void main(String[] args) {
//        String s = "Hello World";         // 5
//        String s = "   fly me   to   the moon  ";         // 4
        String s = "luffy is still joyboy";         // 6

        System.out.println(lengthOfLastWord(s));
    }
}
