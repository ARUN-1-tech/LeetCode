// Last updated: 7/9/2026, 10:06:52 AM
class Solution {
    public int maxProfit(int[] prices) {
        int a=prices[0];
        int l=0,r=0;
        // int max=0;
        // for(int i:prices){
        //     if(i<a){
        //         a=i;
        //     }
        //     else if(i-a>max){
        //         max=i-a;
        //     }
        // }
        // return max;

        int ans=0;
        while(r<prices.length){
            if(prices[r]>prices[l]){
                ans=Math.max(prices[r]-prices[l],ans);
            }else{
                l=r;
            }
            r++;
        }
        return ans;
    }
}