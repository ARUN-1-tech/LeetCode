// Last updated: 7/14/2026, 11:20:03 AM
1class Solution {
2    public int maxArea(int[] height) {
3        int n=height.length;
4        int max=0;
5        int i=0,j=n-1;
6        while(i<j){
7            int min=Math.min(height[i],height[j]);
8            int s=(j-i)*min;
9            max=Math.max(max,s);
10            if(height[i]>height[j]) j--;
11            else i++;
12        }
13        return max;
14    }
15}