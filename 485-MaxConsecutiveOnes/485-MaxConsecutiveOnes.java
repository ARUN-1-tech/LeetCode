// Last updated: 7/9/2026, 10:04:38 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int a=nums.length,n=0,res=0;
        for(int i=0;i<a;i++){
            if(nums[i]==1){
                n++;
            }else{
                if(res<n) res=n;
                n=0;
            }
        }
        return Math.max(res,n);
    }
}