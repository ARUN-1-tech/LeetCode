// Last updated: 7/9/2026, 10:08:51 AM
class Solution {
    public int maxArea(int[] nums) {
        int n=nums.length;
        int a=0,i=0,j=n-1;
        while(i<j){
            int b=Math.min(nums[i],nums[j])*(j-i);
            if(nums[i]<nums[j]) i++;
            else j--;
            a=Math.max(a,b);
        }
        return a;
    }
}