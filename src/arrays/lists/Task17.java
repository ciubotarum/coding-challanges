package arrays.lists;// NOT COMPLETE



import java.util.ArrayList;
import java.util.List;

public class Task17 {
    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        List<Integer> arr = new ArrayList<>(n);

        int lastAnswer = 0;

        for (int i = 0; i < queries.size(); i++) {
            for (int j = 0; j < queries.size(); j++) {
                if (queries.get(i).get(queries.size()) != 0 || queries.get(i).get(queries.size()) != 1) {
                    int idx = ((queries.get(i).get(queries.size() - 1) ^ lastAnswer) % n);
                    arr.add(queries.get(i).get(queries.size()));
                } else {

                }

            }

        }

        return arr;
    }

    public static void main(String[] args) {
        int n = 2;
        List<List<Integer>> queries = List.of(
                List.of(1, 0, 5),
                List.of(1, 1, 7),
                List.of(1, 0, 3),
                List.of(2, 1, 0),
                List.of(2, 1, 1)
        );
        System.out.println(dynamicArray(n, queries));

    }
}
