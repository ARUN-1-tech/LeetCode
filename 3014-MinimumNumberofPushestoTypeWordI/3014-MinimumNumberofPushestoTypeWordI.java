// Last updated: 7/30/2026, 9:05:37 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        Arrays.sort(nums);
4        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
5    }
6}