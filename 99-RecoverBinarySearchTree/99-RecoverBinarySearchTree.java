// Last updated: 7/14/2026, 9:23:29 AM
1class Solution {
2    public double myPow(double x, int n) {
3        return helper(x,(long) n);
4    }
5    public double helper(double x, long n){
6        if(n==0) return 1;
7        if(n<0) return 1/helper(x,-n);
8        if(n%2==0) return helper(x*x,n/2);
9        else return x*helper(x*x,n/2);
10    }
11}