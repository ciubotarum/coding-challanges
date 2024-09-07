package simple.exercises;

import static org.junit.Assert.*;
import java.math.BigInteger;
import org.junit.Test;

public class NChooseKCalculator {
//    You may be familiar with the concept of combinations: for example, if you take 5 cards from a 52 cards deck
//    as you would play poker, you can have a certain number (2,598,960, would you say?) of different combinations.
//
//    In mathematics the number of k combinations you can have taking from a set of n elements is called the
//    binomial coefficient of n and k, more popularly called n choose k.
//
//    The formula to compute it is relatively simple: n choose k==n!/(k!*(n-k)!), where ! of course denotes the factorial operator.
//
//    You are now to create a choose function that computes the binomial coefficient, like this:
//
//    choose(1,1)==1
//    choose(5,4)==5
//    choose(10,5)==252
//    choose(10,20)==0
//    choose(52,5)==2598960

    public static BigInteger choose(int n, int p) {

//        BigInteger combinations = factorial(BigInteger.valueOf(n)).divide(factorial(BigInteger.valueOf(p)).multiply(factorial(BigInteger.valueOf(n-p))));
//
//        return BigInteger.valueOf(0);

        // Another way
//        if (n < p) {
//            return BigInteger.ZERO;
//        }
//
//        // Ensure p <= n-p to minimize the number of iterations
//        if (p > n - p) {
//            p = n - p;
//        }
//
//        BigInteger result = BigInteger.ONE;
//
//        // Calculate C(n, p) = n! / (p! * (n-p)!)
//        for (int i = 0; i < p; i++) {
//            result = result.multiply(BigInteger.valueOf(n - i))
//                    .divide(BigInteger.valueOf(i + 1));
//        }
//
//        return result;

        // Another way
        if (p == 0) {
            return BigInteger.ONE;
        }
        return choose(n,p-1).multiply(BigInteger.valueOf(n-p+1)).divide(BigInteger.valueOf(p));
    }

    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        }
        BigInteger prod = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE ; i.compareTo(n) <= 0; i.add(BigInteger.ONE)) {
            prod = prod.multiply(i);
        }
        return new BigInteger(String.valueOf(prod));
    }

    public static class QuickCalcTest {

        @Test
        public void BasicTests1() {
            System.out.println("****** Basic tests small numbers");
            assertEquals(BigInteger.valueOf(1), NChooseKCalculator.choose(1, 1));
            assertEquals(BigInteger.valueOf(5), NChooseKCalculator.choose(5, 4));
            assertEquals(BigInteger.valueOf(252), NChooseKCalculator.choose(10, 5));
            assertEquals(BigInteger.valueOf(0), NChooseKCalculator.choose(10, 20));
            assertEquals(BigInteger.valueOf(2598960), NChooseKCalculator.choose(52, 5));
        }
        @Test
        public void BasicTests2() {
            System.out.println("****** Basic tests larger numbers");
            assertEquals(BigInteger.valueOf(17310309456440L), NChooseKCalculator.choose(100, 10));
            assertEquals(BigInteger.valueOf(2573031125L), NChooseKCalculator.choose(500, 4));
            assertEquals(BigInteger.valueOf(166167000), NChooseKCalculator.choose(1000, 3));
            assertEquals(BigInteger.valueOf(55098996177225L), NChooseKCalculator.choose(200, 8));
            assertEquals(BigInteger.valueOf(962822846700L), NChooseKCalculator.choose(300, 6));
        }
    }
}
