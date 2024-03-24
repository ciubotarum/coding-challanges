import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task20 {

    static int maxNestedBoxes(int[][] boxes) {
        List<Integer> sortedVolume = new ArrayList<>();
        for (int[] element : boxes) {
            int volume = element[0] * element[1] * element[2];
            sortedVolume.add(volume);
        }

        Collections.sort(sortedVolume);
        Collections.reverse(sortedVolume);
        System.out.println(sortedVolume);

        int currentVolume = sortedVolume.get(0);
        int nrBoxes = 1;
        for (int volume : sortedVolume) {
            if (currentVolume > volume) {
                nrBoxes++;
                currentVolume = volume;
            }
        }


        return nrBoxes;

    }

    public static void main(String[] args) {
        int[][] boxes = {{3, 4, 5}, {4, 5, 6}, {6, 7, 8}, {2, 3, 4}, {8, 6, 7}};
        System.out.println(maxNestedBoxes(boxes));


    }
}
