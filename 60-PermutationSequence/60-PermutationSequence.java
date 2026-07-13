// Last updated: 7/13/2026, 2:50:27 PM
1import java.math.*;
2class Solution {
3    public int divide(int dividend, int divisor) { 
4        int ans = dividend / divisor;
5        if(dividend==Integer.MIN_VALUE && divisor==-1){
6            return Integer.MAX_VALUE;
7        }
8        return ans;
9    }
10}