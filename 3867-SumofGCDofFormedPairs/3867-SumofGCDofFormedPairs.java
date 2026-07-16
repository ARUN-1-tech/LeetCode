// Last updated: 7/16/2026, 9:29:15 AM
1class Solution {
2    public int findGCD(int a, int b) {
3        if (b == 0) {
4            return a;
5        }
6        return findGCD(b, a % b);
7    }
8    public long gcdSum(int[] nums) {
9        int max=0,i=0,j=0;
10        long sum=0;
11        int[] ans=new int[nums.length];
12        while(j<nums.length){
13            max=Math.max(nums[j],max);
14            ans[j]=findGCD(nums[j],max);
15            j++;
16        }
17        Arrays.sort(ans);
18        j=nums.length-1;
19        while(i<j){
20            sum+=findGCD(ans[i],ans[j]);
21            i++;j--;
22        }
23        return sum;
24    }
25}