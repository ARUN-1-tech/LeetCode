// Last updated: 9/8/2026, 10:23:17 AM
1class Solution {
2    public int getMinDistance(int[] nums, int target, int start) {
3        int min = Integer.MAX_VALUE;
4        for (int i = 0; i < nums.length; i++) {
5            if (nums[i] == target) {
6                min = Math.min(min, Math.abs(start - i));
7            }
8        }
9        return min;
10    }
11}