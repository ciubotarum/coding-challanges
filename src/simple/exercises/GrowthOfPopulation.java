package simple.exercises;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class GrowthOfPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int sum = 0;
        int counter = 0;

        while (sum < p) {
            sum = (int) (p0 + p0*(percent/100) + aug);
            p0 = sum;
            counter++;
        }
        return counter;
    }

    public static class GrowthTest {
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: nbYear");
        testing(GrowthOfPopulation.nbYear(1500, 5, 100, 5000),15);
        testing(GrowthOfPopulation.nbYear(1500000, 2.5, 10000, 2000000), 10);
        testing(GrowthOfPopulation.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }
    }
}
