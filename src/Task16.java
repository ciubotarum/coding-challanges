import java.util.List;

public class Task16 {
    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Long>> queries) {
        long[] arr = new long[n + 2];

        for (List<Long> query : queries) {
            int a = query.get(0).intValue();
            int b = query.get(1).intValue();
            long k = query.get(2);

            arr[a] += k;
            arr[b + 1] -= k;
        }

        long max = 0;
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += arr[i];
            arr[i] = sum;
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        int n = 10;
        List<List<Long>> queries = List.of(
                List.of(1L, 5L, 3L),
                List.of(4L, 8L, 7L),
                List.of(6L, 9L, 1L)
        );
        System.out.println(arrayManipulation(n, queries));
    }
}
