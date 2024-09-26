package arrays.lists.codewars;

import java.util.Arrays;


public class SmallestPositiveInteger {
//    Write a function:
//
//    class Solution { public int solution(int[] A); }
//
//    that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//    For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//    Given A = [1, 2, 3], the function should return 4.
//
//    Given A = [−1, −3], the function should return 1.


    public static int solution(int[] A) {

        int[] noDuplicates = Arrays.stream(A).filter(x -> x > 0).distinct().toArray();
        System.out.println(Arrays.toString(noDuplicates));

        Arrays.sort(noDuplicates);
        System.out.println(Arrays.toString(noDuplicates));

        for (int i = 0; i < noDuplicates.length - 1; i++) {
            if (noDuplicates[i] + 1 != noDuplicates[i+1]) {
                if (noDuplicates[i] < 0) {
                    return 1;
                }
                return noDuplicates[i] + 1;
            }
        }

        return noDuplicates.length + 1;

        // Another way to solve the problem
//        return Arrays.stream(A).filter(x -> x > 0).distinct().sorted().reduce(1, (missing, num) -> num == missing ? missing + 1 : missing);
    }

    public static void main(String[] args) {
//        int[] A = {1, 3, 6, 4, 1, 2};   // sol 5
//        int[] A = {1, 2, 3};   // sol 4
//        int[] A = {-1, -3};   // sol 1
        int[] A = {-1, -3, 1, 5};   // sol 2



        System.out.println(solution(A));
    }
}
