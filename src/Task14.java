import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Task14 {
    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here

        // transform list to queue
        Queue<Integer> queue = new LinkedList<>(arr);

        // rotation in a queue
        //  get the first element and add it back to the queue
        for (int i = 0; i < d; i++) {
            Integer x = queue.poll();
            queue.add(x);
        }

        //transform queue to list
        List<Integer> result = new ArrayList<>(queue);

        return result;
    }

    public static void main(String[] args) {
       int d = 2;
       List<Integer> arr = List.of(1, 2, 3, 4, 5);

        System.out.println(rotateLeft(d, arr));
    }
}
