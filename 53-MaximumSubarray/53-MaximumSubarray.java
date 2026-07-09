// Last updated: 7/9/2026, 10:07:45 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int dp = nums[0];
        int maxSum = nums[0]; 
        for (int i = 1; i < nums.length; i++) {
            dp = Math.max(nums[i], dp + nums[i]);
            maxSum = Math.max(maxSum, dp);
        }
        return maxSum;
    }
}
