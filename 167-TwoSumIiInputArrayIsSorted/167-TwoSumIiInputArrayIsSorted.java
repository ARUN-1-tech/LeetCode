// Last updated: 7/9/2026, 10:06:05 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]==target) return new int[]{i+1,j+1};
            else if(nums[i]+nums[j]>target) j--;
            else i++;
        }
        return new int[]{0};
    }
}