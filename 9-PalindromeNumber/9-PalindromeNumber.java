// Last updated: 7/10/2026, 3:49:51 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3        int a=0;
4        int n=x;
5        while(n>0){
6            a=(a*10)+(n%10);
7            n=n/10;
8        }
9        return x==a;
10    }
11}