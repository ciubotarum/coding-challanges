package strings.codewars;

import java.util.*;

public class SubstringNoRepeatingCharacters {
    // Given a string s, find the length of the longest substring without repeating characters

    // Example 1
    // Input: s = "abcabcbb"
    // Output: 3
    // Explanation: The answer is "abc", with the length of 3

    public static int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
//        for (int i = 0; i < s.length(); i++) {
//            StringBuilder currentSubstring = new StringBuilder();
//            for (int j = i; j < s.length(); j++) {
//                if (currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1) {
//                    break;
//                }
//                currentSubstring.append(s.charAt(j));
//                maxLength = Math.max(maxLength, currentSubstring.length());
//                // or this for length
////                if (currentSubstring.length() > maxLength) {
////                    maxLength = currentSubstring.length();
////                }
//            }
//        }

        // Give a better solution

//        Map<Character, Integer> visitedCharacters = new HashMap<>();
//
//        for (int right = 0, left = 0; right < s.length(); right++) {
//            char currentCharacter = s.charAt(right);
//            if (visitedCharacters.containsKey(s.charAt(right)) && visitedCharacters.get(s.charAt(right)) >= left) {
//                left = visitedCharacters.get(s.charAt(right)) + 1;
//            }
//            maxLength = Math.max(maxLength, right - left + 1);
//            visitedCharacters.put(currentCharacter, right);
//        }

        // Another better solution
        for (int right = 0, left = 0; right < s.length(); right++) {
            int indexOfFirstAppearanceInSubstring = s.indexOf(s.charAt(right), left);
            if (indexOfFirstAppearanceInSubstring != right) {
                left = indexOfFirstAppearanceInSubstring + 1;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
//        String s = "abcabcd";

        System.out.println(lengthOfLongestSubstring(s));
    }

}
