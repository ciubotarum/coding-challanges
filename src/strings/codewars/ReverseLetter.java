package strings.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseLetter {
    //    Given a string str, reverse it and omit all non-alphabetic characters.
//
//    Example
//    For str = "krishan", the output should be "nahsirk".
//
//    For str = "ultr53o?n", the output should be "nortlu".
//
//    Input/Output
//[input] string str
//    A string consists of lowercase latin letters, digits and symbols.
//
//[output] a string
    public static String reverseLetter(final String str) {
//        StringBuilder builder = new StringBuilder();
//        for (int i = str.length() - 1; i >= 0 ; i--) {
//            builder.append(str.charAt(i));
//        }
//        return builder.toString()
//                .replaceAll("[^\\\\sa-zA-Z0-9]", "")
//                .replaceAll("[0-9]", "")
//                .replace("\\", "");

        // else
        return new StringBuilder(str.replaceAll("[^a-zA-Z]", "")).reverse().toString();
    }
    public static class SampleTest {
        @Test
        public void testSomething() {
            doTest("krishan", "nahsirk");
            doTest("ultr53o?n", "nortlu");
            doTest("ab23c", "cba");
            doTest("krish21an", "nahsirk");
        }
        private void doTest(final String str, final String expected) {
            assertEquals(expected, ReverseLetter.reverseLetter(str));
        }
    }
}
