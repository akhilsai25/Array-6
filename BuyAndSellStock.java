// This solution uses a single traversal approach to calculate the min so far and further calculate the profit by subtracting existing number
// We keep running max profit to see which has ability to get max profit if we sell on any day
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minSoFar = prices[0];
        for(int i=1;i<prices.length;i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
            maxProfit=Math.max(maxProfit, prices[i]-minSoFar);
        }
        return maxProfit;
    }
}
