// Last updated: 7/16/2026, 9:14:55 AM
1class Solution {
2    public long gcdSum(int[] nums) {
3        int max=0,i=0,j=0;
4        long sum=0;
5        int[] ans=new int[nums.length];
6        while(j<nums.length){
7            max=Math.max(nums[j],max);
8            ans[j]=max;
9            j++;
10        }
11        for(int k=0;k<ans.length;k++){
12            ans[k]=findGCD(nums[k],ans[k]);
13        }
14        Arrays.sort(ans);
15        j=nums.length-1;
16        while(i<j){
17            sum+=findGCD(ans[i],ans[j]);
18            i++;j--;
19        }
20        return sum;
21    }
22    public static int findGCD(int a, int b) {
23        if (b == 0) {
24            return a;
25        }
26        return findGCD(b, a % b);
27    }
28}