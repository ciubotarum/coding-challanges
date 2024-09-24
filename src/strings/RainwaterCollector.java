package strings;

public class RainwaterCollector {
//    Today our world is approaching an ecological crisis. Due to global warming, the sea level is rising.
//    At the same time, the amount of drinkable water is decreasing. One idea about preventing the loss of drinkable
//    water is the propagation of rainwater storage, in other words, equipping houses with a water tank for rainwater.
//
//    You are given a string S describing a street, in which 'H' denotes a house and '-' denotes an empty plot.
//    You may place water tanks in empty plots to collect rainwater from nearby houses. A house can collect its own
//    rainwater if there is a tank next to it (on either the left or the right side).
//
//    Your task is to find the minimum number of water tanks needed to collect rainwater from all the houses.
//
//    For example, given S = "-H-HH--", you can collect rainwater from all three houses by using two water tanks.
//    You can position one water tank between the first and second houses and the other after the third house.
//    This placement of water tanks can be represented as "-HTHHT-", where 'T' denotes a water tank.

    //    If there is no solution, return -1.
//
//    Examples:
//    Given S = "-H-HH--", the function should return 2, as explained above.
//    Given S = "H", the function should return -1. There is no available plot on which to place a water tank.
//    Given S = "HH-HH", the function should return -1. There is only one plot to put a water tank, and it is
//    impossible to collect rainwater from the first and last houses.
//    Given S = "-H-H-H-H-H", the function should return 3. One possible way of placing water tanks is "-HTH-HTHTH".
    public static int solution(String S) {
        // Implement your solution here
        int tankCounter = 0;
        if (S.length() == 1) {
            return -1;
        }
        if (S.charAt(0) == 'H') {
            if (S.charAt(1) == 'H') {
                return -1;
            }
        }
        if (S.charAt(S.length() - 1) == 'H') {
            if (S.charAt(S.length() - 2) == 'H') {
                return -1;
            }
        }

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'H') {
                if (i + 1 < S.length() && S.charAt(i + 1) == '-') {
                    tankCounter++;
                    i += 2;
                } else if (i > 0 && S.charAt(i - 1) == '-') {
                    tankCounter++;
                } else {
                    return -1;
                }
            }
        }

        return tankCounter;
    }

    public static void main(String[] args) {
//        String S = "-H-HH--";
//        String S = "H";
//        String S = "HH-HH";
        String S = "-H-H-H-H-H";

        System.out.println(solution(S));
    }
}
