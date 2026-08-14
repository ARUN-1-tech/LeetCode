// Last updated: 8/14/2026, 11:11:33 AM
1class Solution {
2    public int findMin(int[] nums) {
3        int i=0,j=nums.length-1;
4        int s=0;
5        while(i<j){
6            int mid=(i+j)/2;
7            if(nums[mid]>nums[j]) i=mid+1;
8            else j=mid;
9        }
10        return nums[i];
11    }
12}