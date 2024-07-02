package arrays.lists;

import java.util.*;

public class SumWithNoDuplicates {
//    Please write a function that sums a list, but ignores any duplicated items in the list.
//
//    For instance, for the list [3, 4, 3, 6] the function should return 10,
//    and for the list [1, 10, 3, 10, 10] the function should return 4.
    public static int sumNoDuplicates(int[] arr){
        Set<Integer> noDuplicates = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int number : arr) {
            if (noDuplicates.contains(number)) {
                duplicates.add(number);
            } else {
                noDuplicates.add(number);
            }
        }
        for (int number : duplicates) {
            noDuplicates.remove(number);
        }

        return  noDuplicates.stream()
                .mapToInt(Integer::intValue)
                .sum();

        // Another way to solve
//        return Arrays.stream(arr)
//                .boxed()
//                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .mapToInt(e -> e.getValue() == 1 ? e.getKey() : 0)
//                .sum();

    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 3, 6};
        System.out.println(sumNoDuplicates(arr));
    }

}
