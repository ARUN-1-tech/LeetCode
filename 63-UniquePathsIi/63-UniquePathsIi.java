// Last updated: 7/9/2026, 10:07:37 AM
class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int[][] dp=new int[m][n];
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
            if(arr[row][col]==1)
                dp[row][col]=0;
            else if( row==0 && col==0 )
                dp[row][col]=1;
                
            else{
                int top=0,left=0;
                if(row-1>=0)
                    top=dp[row-1][col];
                if(col-1>=0)
                    left=dp[row][col-1];
                dp[row][col]=top+left;
            }
        }
    }
    return dp[m-1][n-1];
        
    }
}