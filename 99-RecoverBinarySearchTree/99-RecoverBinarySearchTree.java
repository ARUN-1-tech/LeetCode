// Last updated: 7/14/2026, 10:06:12 AM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int n=nums.length,j=0;
4        for(int i=0;i<n;i++){
5            if(nums[i]!=0){
6                int t=nums[j];
7                nums[j]=nums[i];
8                nums[i]=t;
9                j++;
10            }
11        }
12    }
13}