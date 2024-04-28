import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result6 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeros = 0;

        for (int number : arr) {
            if (number > 0) {
                positiveNumbers += 1;
            }
            if (number < 0) {
                negativeNumbers += 1;
            }
            if (number == 0) {
                zeros += 1;
            }
        }

        double positiveRatio = (double) positiveNumbers / arr.size();
        double negativeRatio = (double) negativeNumbers / arr.size();
        double zeroRatio = (double) zeros / arr.size();

        System.out.println(positiveRatio);
        System.out.println(negativeRatio);
        System.out.println(zeroRatio);
    }

}

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result6.plusMinus(arr);

        bufferedReader.close();
    }
}
