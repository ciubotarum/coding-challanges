package strings;

import java.util.ArrayList;
import java.util.List;

public class Task15 {
    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY stringList
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here
        List<Integer> results = new ArrayList<>();

        for (String que : queries) {
            int sum = 0;
            for (String element : stringList) {
                if (element.equals(que)) {
                    sum++;
                }
            }
            results.add(sum);
        }

        return results;
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("ab", "ab", "abc");
        List<String> queries = List.of("ab", "abc", "bc");

        System.out.println(matchingStrings(stringList, queries));
    }
}
