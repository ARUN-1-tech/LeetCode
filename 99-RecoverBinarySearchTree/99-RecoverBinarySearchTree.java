// Last updated: 7/14/2026, 12:13:23 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        int n = nums.length;
5        Arrays.sort(nums);
6        for (int i = 0; i < n - 2; i++) {
7            if (i > 0 && nums[i] == nums[i - 1]) continue;
8            int left = i + 1;
9            int right = n - 1;
10            while (left < right) {
11                int sum = nums[i] + nums[left] + nums[right];
12                if (sum == 0) {
13                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
14                    left++;
15                    right--;
16                    while (left < right && nums[left] == nums[left - 1]) left++;
17                    while (left < right && nums[right] == nums[right + 1]) right--;
18                }
19                else if (sum < 0) left++;
20                else right--;
21            }
22        }
23        return result;
24    }
25}