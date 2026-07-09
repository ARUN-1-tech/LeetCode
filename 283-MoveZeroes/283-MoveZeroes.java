// Last updated: 7/9/2026, 10:05:18 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length,j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int t=nums[j];
                nums[j]=nums[i];
                nums[i]=t;
                j++;
            }
        }
    }
}