// Last updated: 7/13/2026, 2:48:04 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int n=nums.length;
4        int s=nums[0];
5        int[] dp=new int[n];
6        dp[0]=nums[0];
7        for(int i=1;i<n;i++){
8            dp[i]=Math.max(nums[i],nums[i]+dp[i-1]);
9            if(dp[i]>s) s=dp[i];
10        }
11        return s;
12    }
13}