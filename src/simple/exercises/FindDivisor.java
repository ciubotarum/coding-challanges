package simple.exercises;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class FindDivisor {
//    Count the number of divisors of a positive integer n.
//
//    Random tests go up to n = 500000.
//
//    Examples (input --> output)
//        4 --> 3 // we have 3 divisors - 1, 2 and 4
//        5 --> 2 // we have 2 divisors - 1 and 5
//        12 --> 6 // we have 6 divisors - 1, 2, 3, 4, 6 and 12
//        30 --> 8 // we have 8 divisors - 1, 2, 3, 5, 6, 10, 15 and 30
//    Note you should only return a number, the count of divisors. The numbers between parentheses are shown only
//    for you to see which numbers are counted in each case.
    public long numberOfDivisors(int n) {
        // TODO please write your code below this comment
        long counter = 0L;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        return counter;

        // else
//        return IntStream.range(1, n+1).filter(i -> n%i==0).count();
    }

    public static class DividerTests {

        FindDivisor fd = new FindDivisor();

        @Test
        public void oneTest() {
            assertEquals("Should return 1 if the parameter equals 1", 1, fd.numberOfDivisors(1));
        }

        @Test
        public void fourTest() {
            assertEquals("Should return 3 if the parameter equals 4", 3, fd.numberOfDivisors(4));
        }

        @Test
        public void fiveTest() {
            assertEquals("Should return 2 if the parameter equals 5", 2, fd.numberOfDivisors(5));
        }

        @Test
        public void twelveTest() {
            assertEquals("Should return 6 if the parameter equals 12", 6, fd.numberOfDivisors(12));
        }

        @Test
        public void thirtyTest() {
            assertEquals("Should return 8 if the parameter equals 30", 8, fd.numberOfDivisors(30));
        }
    }
}
