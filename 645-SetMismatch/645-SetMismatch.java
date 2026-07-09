// Last updated: 7/9/2026, 10:04:22 AM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
        Arrays.sort(nums);
        int sum=0,a=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                ans[0]=nums[i];
                nums[i]=0;
                break;
            }
        }
        
        for(int num:nums){
            sum+=num;
        }
        for(int i=1;i<=nums.length;i++){
            a+=i;
        }
        ans[1]=a-sum;
        return ans;
    }
}