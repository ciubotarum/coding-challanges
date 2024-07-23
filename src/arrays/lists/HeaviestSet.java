package arrays.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HeaviestSet {

    /*
     * Complete the 'minimalHeaviestSetA' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> minimalHeaviestSetA(List<Integer> arr) {
        // Write your code here
        List<Integer> setA = new ArrayList<>();
        List<Integer> sortedArr = new ArrayList<>(arr);
        Collections.sort(sortedArr, Collections.reverseOrder());
        Integer sum = 0;

        for (Integer element : arr) {
            sum += element;
        }

        int sumA = 0;
        for (Integer element : sortedArr) {
            if (sumA > sum - sumA) {
                break;
            }
            setA.add(element);
            sumA += element;
        }

        Collections.sort(setA);

        return setA;
    }

    public static void main(String[] args) {
//        List<Integer> arr = List.of(5, 3, 2, 4, 1, 2);
        List<Integer> arr = List.of(4, 2, 5, 1, 6);
//        List<Integer> arr = List.of(3, 7, 5, 6, 2);

        System.out.println(minimalHeaviestSetA(arr));
    }

}

