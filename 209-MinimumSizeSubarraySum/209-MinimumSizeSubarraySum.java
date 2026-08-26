// Last updated: 8/26/2026, 7:38:28 PM
1class Solution { 
2    public int minSubArrayLen(int target, int[] nums) { 
3        int c = Integer.MAX_VALUE; 
4        int s = 0; 
5        int i = 0; 
6
7        for (int j = 0; j < nums.length; j++) { 
8            s += nums[j]; 
9            
10            while (s >= target) { 
11                c = Math.min(c, j - i + 1); 
12                s -= nums[i]; 
13                i++; 
14            } 
15        } 
16        
17        return (c != Integer.MAX_VALUE) ? c : 0; 
18    } 
19}
20