// Last updated: 7/9/2026, 10:08:27 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0,j=1;
        while(j<n){
            if(nums[i]==nums[j]) j++;
            else{
                i++;
                int t=nums[j];
                nums[i]=nums[j];
                nums[j]=t;
                j++;
            }
        }
        return i+1;
    }
}