// Last updated: 7/15/2026, 9:37:57 AM
1class Solution {
2    public int[][] modifiedMatrix(int[][] matrix){
3        for(int i=0;i<matrix[0].length;i++){
4            int x=0;
5            for(int j=0;j<matrix.length;j++){
6                x=Math.max(x,matrix[j][i]);
7                
8            }
9            for(int a=0;a<matrix.length;a++){
10                if(matrix[a][i]==-1) matrix[a][i]=x;
11            } 
12        }
13        return matrix;
14    }
15}