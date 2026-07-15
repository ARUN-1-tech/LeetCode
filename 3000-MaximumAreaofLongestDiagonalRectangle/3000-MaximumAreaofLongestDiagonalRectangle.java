// Last updated: 7/15/2026, 9:10:48 AM
1class Solution {
2    public int areaOfMaxDiagonal(int[][] dim) {
3        int x=0,y=0;
4        for(int i=0;i<dim.length;i++){
5                int a=dim[i][0];
6                int b=dim[i][1];
7                int cur=a*a+b*b;
8                int z=a*b;
9                if(cur>y || (cur==y && z>x)){
10                    y=cur;
11                    x=z;
12                }
13        }
14        return x;
15    }
16}