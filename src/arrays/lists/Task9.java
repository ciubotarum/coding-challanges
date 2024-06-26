package arrays.lists;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result9 {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int maxNumber = 0;
        int numberOfHighestCandles = 0;

        // Iterate through the list to find the maximum number
        for (int i = 0; i < candles.size(); i++) {
            int currentNumber = candles.get(i);

            // daca e mai mare decat max atunci reseteaza caunt si max number
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
                numberOfHighestCandles = 0;
            }

            // daca e egal cu max atunci count++
            if (currentNumber == maxNumber) {
                numberOfHighestCandles += 1;
            }
        }

        return numberOfHighestCandles;
    }

}

public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result9.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
