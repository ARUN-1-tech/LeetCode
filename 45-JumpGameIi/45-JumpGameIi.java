// Last updated: 7/9/2026, 10:07:53 AM
class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i=0;i<nums.length; i++)  dp[i] = 99999;
        dp[0] = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1;j < nums.length && j <= i+nums[i]; j++){
                dp[j] = Math.min(dp[j], dp[i] + 1);
            }
        }
        return dp[nums.length - 1];
    }
}