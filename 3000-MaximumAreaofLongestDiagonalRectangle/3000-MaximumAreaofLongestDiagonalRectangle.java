// Last updated: 7/15/2026, 10:07:46 AM
1class Solution {
2    public int[] decompressRLElist(int[] nums) {
3        int k=0,size=0;
4        for (int i = 0; i < nums.length; i += 2) {
5            size += nums[i];
6        }
7        int[] ans = new int[size];
8        int n=nums.length;
9        for(int i=0;i<n;i+=2){
10            while(nums[i]>0){
11                ans[k++]=nums[i+1];
12                nums[i]--;
13            }
14        }
15        return ans;
16    }
17}