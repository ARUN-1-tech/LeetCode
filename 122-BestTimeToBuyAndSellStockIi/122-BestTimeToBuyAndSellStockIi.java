// Last updated: 7/9/2026, 10:06:51 AM
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i=0;i<prices.length-1;i++) {
            if(prices[i]<prices[i+1]){
                max+=prices[i+1]-prices[i];
            }
        }
        return max;
    }
}