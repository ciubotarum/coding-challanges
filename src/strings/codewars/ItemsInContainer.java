package strings.codewars;

import java.util.ArrayList;
import java.util.List;

public class ItemsInContainer {
    // Given a string s consisting of items as "*" and "|", an array of starting indices and an array of end indices,
    // determine the number of items in closed compartments within the substring between two indices, inclusive.
    // Compartments are between "|" (pair of pipes that may  or may not have items between them..
    // "*" = ascii decimal 42
    // "|" = ascii decimal 142

    // Example
    // s = "|**|*|*"
    // startIndices = [1, 1]
    // endIndices = [5, 6]
    // The string has a total of 2 closed compartments, one with 2 items and one with one item. For the first
    // pair of indices, (1, 5), the substring is "|**|*". There are 2 items in a compartment.
    // For second pair of indices, (1, 6), the substring is "|**|*|" and there are 2 + 1 = 3 items in compartments.
    // Both of the answers are returned in an array, [2, 3].

    public static List<Integer> numberOfItems (String s, List<Integer> startIndices, List<Integer> endIndices) {

        int n = s.length();
        int[] itemPrefixSum = new int[n];
        int[] nearestLeftPipe = new int[n];
        int[] nearestRightPipe = new int[n];

        int itemCount = 0;
        int lastPipeIndex = -1;

        // Calculate item prefix sum and nearest left pipe index
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '*') {
                itemCount++;
            } else if (s.charAt(i) == '|') {
                lastPipeIndex = i;
            }
            itemPrefixSum[i] = itemCount;
            nearestLeftPipe[i] = lastPipeIndex;
        }

        lastPipeIndex = -1;
        // Calculate nearest right pipe index
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '|') {
                lastPipeIndex = i;
            }
            nearestRightPipe[i] = lastPipeIndex;
        }

        List<Integer> results = new ArrayList<>();

        // Calculate the number of items for each query
        for (int i = 0; i < startIndices.size(); i++) {
            int start = startIndices.get(i) - 1; // Convert to zero-based index
            int end = endIndices.get(i) - 1;     // Convert to zero-based index

            int left = nearestRightPipe[start];
            int right = nearestLeftPipe[end];

            if (left != -1 && right != -1 && left < right) {
                results.add(itemPrefixSum[right] - itemPrefixSum[left]);
            } else {
                results.add(0);
            }
        }

        return results;
    }

    public static void main(String[] args) {
//        List<Integer> startIndices = List.of(1);
        List<Integer> startIndices = List.of(1, 1);

//        List<Integer> endIndices = List.of(3);
//        List<Integer> endIndices = List.of(6);
        List<Integer> endIndices = List.of(5, 6);

//        String s = "*|*|";
//        String s = "*|*|*|";
        String s = "|**|*|*";

        List<Integer> result = numberOfItems(s, startIndices, endIndices);
        System.out.println(result);
//        System.out.println(numberOfItems(s, startIndices, endIndices));
    }
}
