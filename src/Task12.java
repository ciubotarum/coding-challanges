import java.util.ArrayList;
import java.util.List;

public class Task12 {
    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> b = new ArrayList<>();
        for (int i = a.size() - 1; i >= 0; i--) {
            b.add(a.get(i));
        }

        return b;

    }

    public static void main(String[] args) {
        List<Integer> a = List.of(1, 4, 3, 2);
        System.out.println(reverseArray(a));
    }
}
