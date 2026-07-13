// Last updated: 7/13/2026, 9:30:39 PM
1class Solution {
2    public double myPow(double x, int n) {
3        return solve(x, (long) n);
4    }
5
6    private double solve(double x, long n) {
7        if (n == 0) return 1.0;
8        if (n < 0) return 1 / solve(x, -n);
9        if (n % 2 == 0) return solve(x * x, n / 2);
10        else return x * solve(x * x, n / 2);
11    }
12}
13