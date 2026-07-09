// Last updated: 7/9/2026, 10:05:25 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length,pre=1,suf=1;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=pre;
            pre*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            arr[i]*=suf;
            suf*=nums[i];
        }
        return arr;
    }
}