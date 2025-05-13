public class BuySellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // update buying price
            } else {
                int profit = prices[i] - minPrice; // potential profit
                if (profit > maxProfit) {
                    maxProfit = profit; // update best profit
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}
