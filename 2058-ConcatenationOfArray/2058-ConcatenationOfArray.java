// Last updated: 7/9/2026, 10:03:11 AM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int a=nums.length;
        int[] ans=new int[a*2];
        for(int i=0;i<a*2;i++){
            if(i<a){
                ans[i]=nums[i];
            }else{
                ans[i]=nums[i-a];
            }
        }
        return ans;
    }
}