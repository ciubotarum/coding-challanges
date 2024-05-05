package arrays.lists;

public class Task21 {

    static int findMaxProfit(int[] stockPrices) {

        int currentStock = stockPrices[0];
        int currentProfit = Integer.MIN_VALUE;
        int totalProfit = 0;
        for (int i = 1; i < stockPrices.length; i++) {
            int diff = stockPrices[i] - currentStock;

            if (diff < 0) {
                currentStock = stockPrices[i];
                continue;
            }
            if (diff > 0) {
                if (diff > currentProfit) {
                    currentProfit = diff;
                } else {
                    currentStock = stockPrices[i];
                    totalProfit += currentProfit;
                    currentProfit = Integer.MIN_VALUE;
                }
            }
        }

        return totalProfit;
    }
    public static void main(String[] args) {
        int[] stockPrices = {7, 1, 5, 3, 6, 4};
        System.out.println(findMaxProfit(stockPrices));
    }
}
