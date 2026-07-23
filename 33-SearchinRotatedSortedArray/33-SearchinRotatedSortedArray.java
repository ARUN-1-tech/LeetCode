// Last updated: 7/23/2026, 9:59:30 PM
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        List<List<Integer>> result = new ArrayList<>();
4        if (nums == null || nums.length < 4) return result;
5        Arrays.sort(nums);
6        int n = nums.length;
7        for (int i = 0; i < n - 3; i++) {
8            if (i > 0 && nums[i] == nums[i - 1]) continue;
9            for (int j = i + 1; j < n - 2; j++) {
10                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
11                int left = j + 1;
12                int right = n - 1;
13                while (left < right) {
14                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
15                    if (sum == target) {
16                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
17                        while (left < right && nums[left] == nums[left + 1]) left++;
18                        while (left < right && nums[right] == nums[right - 1]) right--;
19                        left++;
20                        right--;
21                    } else if (sum < target) {
22                        left++;
23                    } else {
24                        right--;
25                    }
26                }
27            }
28        }
29        return result;
30    }
31}
32