package arrays.lists;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result8 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        Long minimumSum = 0L;
        Long maximumSum = 0L;

        Collections.sort(arr);

        for (int i = 0; i < arr.size() - 1; i++) {
            minimumSum += arr.get(i);
        }
        for (int i = arr.size() - 1; i >= 1; i--) {
            maximumSum += arr.get(i);
        }
        System.out.println(minimumSum + " " + maximumSum);

    }

}

public class Task8 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result8.miniMaxSum(arr);

        bufferedReader.close();
    }
}
