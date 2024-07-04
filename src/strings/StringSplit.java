package strings;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(Enclosed.class)
public class StringSplit {
//    Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd
//    number of characters then it should replace the missing second character of the final pair with an underscore ('_').
//
//    Examples:
//
//            * 'abc' =>  ['ab', 'c_']
//            * 'abcdef' => ['ab', 'cd', 'ef']
    public static String[] solution(String s) {
        List<String> splited = new ArrayList<>();

        if (s.length() % 2 != 0) {
            String newString = s + '_';
            for (int i = 0; i < newString.length(); i += 2) {
                splited.add(newString.substring(i, i + 2));
            }
        } else {
            for (int i = 0; i < s.length(); i += 2) {

                splited.add(s.substring(i, i + 2));
            }
        }

        String[] myArray = new String[splited.size()];

        return splited.toArray(myArray);

        // Another solution
//        return (s + (s.length() % 2 > 0 ? "_" : "")).split("(?<=\\G.{2})");
    }

    public static class SampleTest {
        @Test
        public void testEvenString() {
            String s = "abcdef";
            String s1 = "HelloWorld";
            assertEquals("Should handle even string","[ab, cd, ef]", Arrays.toString(StringSplit.solution(s)));
            assertEquals("Should handle even string","[He, ll, oW, or, ld]", Arrays.toString(StringSplit.solution(s1)));
        }

        @Test
        public void testOddString() {
            String s = "abcde";
            String s1 = "LovePizza";
            assertEquals("Should handle odd string","[ab, cd, e_]", Arrays.toString(StringSplit.solution(s)));
            assertEquals("Should handle odd string","[Lo, ve, Pi, zz, a_]", Arrays.toString(StringSplit.solution(s1)));
        }
    }
}
