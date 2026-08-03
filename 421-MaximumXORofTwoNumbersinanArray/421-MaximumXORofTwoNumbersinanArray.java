// Last updated: 8/3/2026, 2:29:16 PM
1class Solution {
2    public int findMaximumXOR(int[] nums) {
3        int maxResult = 0;
4        int mask = 0;
5        for (int i = 31; i >= 0; i--) {
6            mask = mask | (1 << i);
7            HashSet<Integer> set = new HashSet<>();
8            for (int n : nums) {
9                set.add(n & mask);
10            }
11            int target = maxResult | (1 << i);
12            for (int prefix : set) {
13                if (set.contains(prefix ^ target)) {
14                    maxResult = target;
15                    break;
16                }
17            }
18        }
19        return maxResult;
20    }
21}
22