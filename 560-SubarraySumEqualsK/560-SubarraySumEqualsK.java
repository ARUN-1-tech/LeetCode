// Last updated: 7/9/2026, 10:04:32 AM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length,a=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==k) a++;
                
            }
        }
        return a;
    }
}