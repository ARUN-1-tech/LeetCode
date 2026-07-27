// Last updated: 7/27/2026, 2:32:00 PM
1class Solution {
2    public boolean isHappy(int n) {
3        int s=0;
4        if(n==1||n==7) return true;
5        else if(n<10) return false;
6        else{
7            while(n>0){
8                int t=(n%10);
9                s+=t*t;
10                n=n/10;
11            }
12        }
13        return isHappy(s);
14    }
15}