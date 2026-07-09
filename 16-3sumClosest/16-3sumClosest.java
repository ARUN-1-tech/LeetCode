// Last updated: 7/9/2026, 10:08:49 AM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int cs=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-1;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(Math.abs(target-cs)>Math.abs(target-sum)) cs=sum;
                if(sum<target) l++;
                else if(sum>target) r--;
                else return sum;
            }
        }
        return cs;
    }
}