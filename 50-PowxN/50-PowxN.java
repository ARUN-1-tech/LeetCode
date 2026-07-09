// Last updated: 7/9/2026, 10:07:47 AM
class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(n<0) return 1/(x*myPow(x,-(n+1)));
        double h=myPow(x,n/2);
        if(n%2==0) return h*h;
        else return x*h*h;
    }
}