// Last updated: 7/14/2026, 11:10:05 AM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int n=nums.length,a=0;
4        for(int i=0;i<n;i++){
5            int sum=0;
6            for(int j=i;j<n;j++){
7                sum+=nums[j];
8                if(sum==k) a++;
9            }
10        }
11        return a;
12    }
13}