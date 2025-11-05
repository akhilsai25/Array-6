// This solution uses a two fold approach where we maintain buy (min) and sell (max) for a single transaction and same for considated i.e., 2 trasnactions buy and sell values
// At each index we calculate the min buy by maintaining min so far and max profit by maintaining max profit so far if we sell at that point
// Similarly at same point we calculate profit if we buy the stock at that day as a second transaction and the new buyv price will be buy price at that point minus profit earned in first transaction
// Sell at that point would be max of existing and if we sell it off immediately
class Solution {
    public int maxProfit(int[] prices) {
        int buy1=prices[0], sell1 = 0, buy2=prices[0], sell2 = 0;

        for(int i=0;i<prices.length;i++) {
            buy1 = Math.min(buy1, prices[i]);
            sell1 = Math.max(sell1, prices[i]-buy1);

            buy2 = Math.min(buy2, prices[i]-sell1);
            sell2 = Math.max(sell2, prices[i]-buy2);
        }
        return sell2;
    }
}

