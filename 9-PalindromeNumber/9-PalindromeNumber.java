// Last updated: 7/10/2026, 4:17:59 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int[] ans=new int[2];
4        Arrays.fill(ans,-1);
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==target){
7                if(ans[0]!=-1) ans[1]=i;
8                else ans[0]=i;
9            }
10        }
11        if(ans[0]!=-1 && ans[1]==-1) ans[1]=ans[0];
12        return ans;
13    }
14}