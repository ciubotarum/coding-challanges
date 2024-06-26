package arrays.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryArrayToNumber {
//    Given an array of ones and zeroes, convert the equivalent binary value to an integer.
//
//    Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
        // inverseaza vector
        Collections.reverse(binary);
        int result = 0;
        // pentru fiecare element din vector calculeaza puteri ale lui 2
        for (int i = 0; i < binary.size(); i++) {
            double pow = Math.pow(2, i);
            // daca bitul curent e 1 atunc iaduni, daca nu ignori
            if (binary.get(i) == 1) {
                result += pow;
            }

        }

        return result;
    }

    public static void main(String[] args) {

    }

    public  static class BinaryArrayToNumberTest {
        @org.junit.Test
        public void convertBinaryArrayToInt() throws Exception {

            assertEquals(1, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
            assertEquals(15, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
            assertEquals(6, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
            assertEquals(9, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));


        }

    }
}

