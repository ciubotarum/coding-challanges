public class Task11 {
    /*
     * Complete the 'theGreatXor' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER x as parameter.
     */

    public static long theGreatXor(long x) {
        // Write your code here
//        long counter = 0;
//
//        for (long a = 1; a < x; a++) {
//            long result = a ^ x;
//            if (result > x) {
//                counter += 1;
//            }
//        }
//
//        return counter;
        int numBits = 64 - Long.numberOfLeadingZeros(x);

        // Calculate the number of integers that would result in a greater value
        // after performing the XOR operation with x
        long count = (1L << numBits) - x - 1;

        return count;

    }

    public static void main(String[] args) {
        long x = 5;
        System.out.println(theGreatXor(x));
    }
}
