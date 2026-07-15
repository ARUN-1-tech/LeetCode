// Last updated: 7/15/2026, 9:06:43 AM
1class Solution {
2    public int areaOfMaxDiagonal(int[][] dim) {
3        int x=0,y=0;
4        for(int i=0;i<dim.length;i++){
5                int a=dim[i][0];
6                int b=dim[i][1];
7                int cur=a*a+b*b;
8                if(cur>y || (cur==y && a*b>x)){
9                    y=cur;
10                    x=a*b;
11                }
12        }
13        return x;
14    }
15}