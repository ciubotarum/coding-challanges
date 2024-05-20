package simple.exercises;

public class CountOddNumbers {
//    Given a number n, return the number of positive odd numbers below n
    public static int oddCount(int n){
//        int count = 0;
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 0) {
//                count++;
//            }
//        }
//
//        return count;
        return n / 2;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(oddCount(n));
    }
}
