// Last updated: 7/24/2026, 12:37:39 PM
1class Solution {
2    public int trap(int[] nums) {
3        int n = nums.length;
4        if (n == 0) return 0;
5
6        int[] leftMax = new int[n];
7        int[] rightMax = new int[n];
8        int amo = 0;
9
10        leftMax[0] = nums[0];
11        for (int i = 1; i < n; i++) {
12            leftMax[i] = Math.max(leftMax[i - 1], nums[i]);
13        }
14
15        rightMax[n - 1] = nums[n - 1];
16        for (int i = n - 2; i >= 0; i--) {
17            rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
18        }
19
20        for (int i = 0; i < n; i++) {
21            amo += Math.min(leftMax[i], rightMax[i]) - nums[i];
22        }
23
24        return amo;
25    }
26}
27