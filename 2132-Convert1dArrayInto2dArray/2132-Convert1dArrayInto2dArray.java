// Last updated: 7/9/2026, 10:03:07 AM
class Solution {
    public int[][] construct2DArray(int[] org, int m, int n) {
        if (m * n != org.length) {
            return new int[0][0]; 
        }
        int[][] ans=new int[m][n];
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=org[k++];
            }
        }
        return ans;
    }
}