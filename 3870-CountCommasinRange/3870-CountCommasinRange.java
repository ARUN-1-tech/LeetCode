// Last updated: 9/8/2026, 10:01:44 AM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int y=n;
4        int s=0,p=1;
5        while(n>0){
6            int c=n%10;
7            s+=c;
8            p*=c;
9            n=n/10;
10        }
11        int a=s+p;
12        return y%a==0;
13    }
14}