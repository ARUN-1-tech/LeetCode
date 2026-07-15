// Last updated: 7/15/2026, 11:23:50 AM
1class Solution {
2    public void rotate(int[][] matrix) {
3        int n=matrix.length,k=n-1;
4        for(int i=0;i<n;i++){
5            for(int j=i;j<k-i;j++){
6                int temp=matrix[i][j];
7                matrix[i][j]=matrix[k-j][i];
8                matrix[k-j][i]=matrix[k-i][k-j];
9                matrix[k-i][k-j]=matrix[j][k-i];
10                matrix[j][k-i]=temp;
11            }
12        }
13    }
14}