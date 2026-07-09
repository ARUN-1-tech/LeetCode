// Last updated: 7/9/2026, 10:03:13 AM
class Solution {
    public int[] buildArray(int[] nums) {
        int a=nums.length;
        int[] ans=new int[a];
        for(int i=0;i<a;i++){
            if(i==nums[i]){
                ans[i]=nums[i];
            }else{
                ans[i]=nums[nums[i]];
            }
        }
        return ans;
    }
}