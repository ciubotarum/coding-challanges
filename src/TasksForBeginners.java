import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TasksForBeginners {


        public static String disemvowel(String str) {
            String[] arr = str.split("");
            StringBuilder newString = new StringBuilder();

            for (int i = 0; i < arr.length; i++) {
                if (i % n == 0) {
                    System.out.println(arr[i]);
                    newString.append(arr[i]);
                }
            }

            return newString.toString();
        }
    public static void main(String[] args) {
         String str = "This website is for losers LOL!";

        // Troll
        System.out.println(disemvowel(str));
    }
}
