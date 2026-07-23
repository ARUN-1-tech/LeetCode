// Last updated: 7/23/2026, 10:01:59 PM
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3         int n = nums.length;
4        List<List<Integer>> ans = new ArrayList<>();
5        Arrays.sort(nums);
6        for (int i = 0; i < n; i++) {
7            if (i > 0 && nums[i] == nums[i - 1]) continue;
8            for (int j = i + 1; j < n; j++) {
9                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
10                int left = j + 1, right = n - 1;
11                while (left < right) {
12                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
13                    if (sum == target) {
14                        ans.add(Arrays.asList(nums[i], nums[j],nums[left], nums[right]));
15                        while (left < right && nums[left] == nums[left + 1]) left++;
16                        while (left < right && nums[right] == nums[right - 1]) right--;
17                        left++;
18                        right--;
19                    }
20                    else if (sum < target) left++;
21                    else right--;
22                }
23            }
24        }
25        return ans;
26    }
27}
28        