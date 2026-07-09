// Last updated: 7/9/2026, 10:07:22 AM
class Solution {
    public void sortColors(int[] nums) {
        int r=0,w=0,b=0;
        int i=nums.length-1;
        while(i>=0){
            if(nums[i]==0) r++;
            else if(nums[i]==1) w++;
            else b++;
            i--;
        }
        for(int j=0;j<nums.length;j++){
            if(r-->0) nums[j]=0;
            else if(w-->0) nums[j]=1;
            else nums[j]=2;
        }
    }
}