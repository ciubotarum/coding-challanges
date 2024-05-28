package arrays.lists;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Enclosed.class)
public class SequenceSum {
//    In this kata, we will be using a more complicated sequence: 0, 1, 3, 6, 10, 15, 21, 28, ... This sequence is
//    generated with the pattern: "the nth term is the sum of numbers from 0 to n, inclusive".
//    [ 0,  1,    3,      6,   ...]
//      0  0+1  0+1+2  0+1+2+3

//    Your Task
//    Complete the function that takes an integer n and returns a list/array of length abs(n) + 1 of the arithmetic
//    series explained above. When n < 0 return the sequence with negative terms.

//    Examples
// 5  -->  [0,  1,  3,  6,  10,  15]
// -5  -->  [0, -1, -3, -6, -10, -15]
// 7  -->  [0,  1,  3,  6,  10,  15,  21,  28]
    public static int[] sumOfN(int n) {
        int[] sequence = new int[Math.abs(n) + 1];

        if (n > 0) {
            for (int i = 1; i < sequence.length; i++) {
                sequence[i] = sequence [i - 1] + i;
            }
        }

        if (n < 0) {
            for (int i = 1; i < sequence.length; i++) {
                sequence[i] = -1 * (-sequence [i - 1] + i);
            }
        }

        return sequence;

        // or
//        return IntStream.rangeClosed(0, Math.abs(n))
//                .map(i -> n < 0 ? -i * (i + 1) / 2 : i * (i + 1)/2)
//                .toArray();
    }


    public static class SequenceSumTest {
        @Test
        public void testKnownValues() {
            assertArrayEquals(new int[]{0, 1, 3, 6}, SequenceSum.sumOfN(3));
            assertArrayEquals(new int[]{0, -1, -3, -6, -10}, SequenceSum.sumOfN(-4));
            assertArrayEquals(new int[]{0, 1}, SequenceSum.sumOfN(1));
            assertArrayEquals(new int[]{0}, SequenceSum.sumOfN(0));
        }
    }
}
