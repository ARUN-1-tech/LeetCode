// Last updated: 7/15/2026, 12:38:42 PM
1class Solution {
2    public long largestPerimeter(int[] nums) {
3        long ans=0,s=0;
4        for(int num:nums){
5            s+=num;
6        }
7        Arrays.sort(nums);
8        int j=nums.length-1;
9        while (j >= 2 && (s - nums[j]) <= nums[j]) {
10            s=s-nums[j];
11            j=j-1;
12        }
13        for(int i=0;i<=j;i++){
14            ans+=nums[i];
15        }
16        if (j < 2) {
17            return -1;
18        }
19        return ans;
20    }
21}