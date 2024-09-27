package strings.codewars;

import java.util.Arrays;

public class SymmetricalNames {
    // The chief aim of the algorithm is to rearrange the characters in the original symmetrical name
    // according to these criteria:

    // the rearranged name is a reshuffled version of the original symmetrical name
    // the restructured name should be symmetrical as well
    // this restructured name should be lexicographically smallest among all its symmetric permutations

    // A string s is considered to be lexicographically smaller than the string t of the same length if the
    // first character in s that differs from that in t is smaller. For example, "abcd" is lexicographically
    // smaller than "abdc" but larger than "abad".

    // Example
    // The original string is nameString = "babab".
    // This can be reversed to give "abbba", which is a symmetric rearrangement of the original symmetrical name
    // and is the smallest possible reverse order.
    // It satisfies all the requirements so return string abbba.

    public static String computeEncodedProductName (String nameString) {
        // Step 1: Count the frequency of each character
        int[] freq = new int[26];  // Assuming only lowercase letters 'a' to 'z'
        for (char c : nameString.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder half = new StringBuilder();
        char oddChar = 0;
        boolean hasOddChar = false;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] % 2 != 0) {
                if (hasOddChar) {
                    // If there is already an odd character, it's impossible to form a symmetric string
                    return "";  // No valid symmetric permutation
                }
                hasOddChar = true;
                oddChar = (char) (i + 'a');  // Store the odd character

            }
            // Append half of the characters to the first half
            for (int j = 0; j < freq[i] / 2; j++) {
                half.append((char) (i + 'a'));
            }
        }

        // Step 3: Construct the full symmetrical string
        String firstHalf = half.toString();
        String secondHalf = new StringBuilder(firstHalf).reverse().toString();

        // Step 4: If there is an odd character, place it in the middle
        if (hasOddChar) {
            return firstHalf + oddChar + secondHalf;
        } else {
            return firstHalf + secondHalf;
        }
    }

    public static void main(String[] args) {
        String nameString = "babab";

        System.out.println(computeEncodedProductName(nameString));
    }
}
