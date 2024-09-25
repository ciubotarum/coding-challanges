package strings;

import java.util.HashSet;
import java.util.Set;

public class ExtraCharactersInString {
//    You are given a 0-indexed string s and a dictionary of words dictionary. You have to break s into one or more
//    non-overlapping substrings such that each substring is present in dictionary. There may be some extra characters
//    in s which are not present in any of the substrings.
//
//    Return the minimum number of extra characters left over if you break up s optimally.
//
//    Example 1:
//
//    Input: s = "leetscode", dictionary = ["leet","code","leetcode"]
//    Output: 1
//    Explanation: We can break s in two substrings: "leet" from index 0 to 3 and "code" from index 5 to 8.
//    There is only 1 unused character (at index 4), so we return 1.
//
//    Example 2:
//
//    Input: s = "sayhelloworld", dictionary = ["hello","world"]
//    Output: 3
//    Explanation: We can break s in two substrings: "hello" from index 3 to 7 and "world" from index 8 to 12. The
//    characters at indices 0, 1, 2 are not used in any substring and thus are considered as extra characters. Hence,
//    we return 3.

    public static int minExtraChar(String s, String[] dictionary) {
        Set<String> ss = new HashSet<>();
        for (String w : dictionary) {
            ss.add(w);
        }
        int n = s.length();
        int[] f = new int[n + 1];
        f[0] = 0;
        for (int i = 1; i <= n; ++i) {
            f[i] = f[i - 1] + 1;
            for (int j = 0; j < i; ++j) {
                if (ss.contains(s.substring(j, i))) {
                    f[i] = Math.min(f[i], f[j]);
                }
            }
        }
        return f[n];
    }

    public static void main(String[] args) {
        String s = "sayhelloworld";
        String[] dictionary = {"hello","world"};

        System.out.println(minExtraChar(s, dictionary));

    }
}
