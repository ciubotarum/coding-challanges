package arrays.lists.codewars;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class SquareEveryDigit {
    //
//    Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
//    For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)
//    Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)
//    Note: The function accepts an integer and returns an integer.
    public int squareDigits(int n) {
        List<Integer> numbers = new ArrayList<>();

        if (n == 0) {
            return 0;
        }

        StringBuilder builder = new StringBuilder();
        while (n > 0) {
            int digit = n % 10;
            builder.insert(0, digit * digit);
            n = n / 10;
        }

        return Integer.parseInt(builder.toString());

//        return Integer.parseInt(String.valueOf(n)
//                .chars()
//                .map(i -> Integer.parseInt(String.valueOf((char) i)))
//                .map(i -> i * i)
//                .mapToObj(String::valueOf)
//                .collect(Collectors.joining("")));
    }

    public static class SquareDigitTest {
        @Test
        public void test() {
            assertEquals(811181, new SquareEveryDigit().squareDigits(9119));
            assertEquals(0, new SquareEveryDigit().squareDigits(0));
            assertEquals(10136, new SquareEveryDigit().squareDigits(1016));
        }
    }
}
