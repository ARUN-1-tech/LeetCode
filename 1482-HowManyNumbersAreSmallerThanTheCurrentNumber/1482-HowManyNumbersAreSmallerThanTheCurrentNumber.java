// Last updated: 7/9/2026, 10:03:20 AM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int a=nums.length;
        int i=0;
        int[] ans=new int[a];
        for(int k=0;k<a;k++){
            int j=0,b=0;;
            while(j<a){
                if(i==j) j++;
                else if(nums[i]>nums[j]){ b+=1;j++;}
                else j++;
            }
            ans[k]=b;
            i++;
        }
        return ans;
    }
}