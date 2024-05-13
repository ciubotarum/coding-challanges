package arrays.lists;

public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i : arr1) {
            sum1 += i;
        }
        for (int j : arr2) {
            sum2 += j;
        }
        return sum1 + sum2;
        // or just
//        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        System.out.println(arrayPlusArray(arr1, arr2));
    }
}
