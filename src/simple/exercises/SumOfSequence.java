package simple.exercises;

public class SumOfSequence {
//    Your task is to write a function which returns the sum of a sequence of
//    integers.
//
//    The sequence is defined by 3 non-negative values: begin, end, step.
//
//    If begin value is greater than the end, your function should return 0. If end
//    is not the result of an integer number of steps, then don't add it to the sum.
//    See the 4th example below.
//
//    Examples
//
//        2,2,2 --> 2
//        2,6,2 --> 12 (2 + 4 + 6)
//        1,5,1 --> 15 (1 + 2 + 3 + 4 + 5)
//        1,5,3  --> 5 (1 + 4)

    public static int sequenceSum(int start, int end, int step) {
        if (start > end) {
            return 0;
        }
        if (start == end) {
            return start;
        }

        int sum = 0;
        for (int i = start; i <= end; i += step) {
            sum += i;

        }

        return sum;

//        return iterate(start, i -> i <= end, i -> i + step).sum();  another response
    }

    public static void main(String[] args) {
        System.out.println(sequenceSum(2, 6, 2)); // Output: 12
        System.out.println(sequenceSum(1, 5, 1)); // Output: 15
        System.out.println(sequenceSum(1, 5, 3));
        System.out.println(sequenceSum(10, 2, 1)); // Output: 0
    }


}
