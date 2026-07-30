// Last updated: 7/30/2026, 9:20:06 AM
1class Solution {
2    public int maxProduct(int n) {
3        int s=0,a=0,b=0;
4        while(n>0){
5            s=n%10;
6            if(s>a){
7                b=a;
8                a=s;
9            }else if(s>b){
10                b=s;
11            }
12            n=n/10;
13        }
14        return a*b;
15    }
16}