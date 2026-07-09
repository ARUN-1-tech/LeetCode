// Last updated: 7/9/2026, 10:05:20 AM
class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int sum=n*(n+1)/2;
       int arr=0;
       for(int m:nums)
            arr+=m;
       return sum-arr;
    }
}