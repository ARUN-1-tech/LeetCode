// Last updated: 7/30/2026, 9:18:31 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int a=0,b=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]>a){
6                b=a;
7                a=nums[i];
8            }else if(nums[i]>b){
9                b=nums[i];
10            }
11        }
12        return (a-1)*(b-1);
13    }
14}