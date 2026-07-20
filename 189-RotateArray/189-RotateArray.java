// Last updated: 7/20/2026, 2:10:11 PM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        k%=nums.length;
4        abc(nums,0,nums.length-1);
5        abc(nums,0,k-1);
6        abc(nums,k,nums.length-1);
7    }
8    public void abc(int[]nums,int s,int e){
9        while(s<e){
10            int t=nums[s];
11            nums[s]=nums[e];
12            nums[e]=t;
13            s++;e--;
14        }
15    }
16}