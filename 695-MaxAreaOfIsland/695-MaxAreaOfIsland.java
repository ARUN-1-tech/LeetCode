// Last updated: 7/9/2026, 10:04:19 AM
class Solution {
    private int max = 0; 
    public int maxAreaOfIsland(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j=0; j < grid[i].length; j++) {
                if(grid[i][j]== 1) {
                    max=0;
                    bfs(grid, i, j);
                    count=Math.max(count,max);
                }
            }
        }
        return count;
    }
    private void bfs(int[][] grid, int i, int j) {
        if(i >= grid.length || i < 0 || j < 0 || j >= grid[i].length || grid[i][j] == 0) {
            return;
        }
        max++;
        grid[i][j] = 0;
        bfs(grid, i+1, j);
        bfs(grid, i-1, j);
        bfs(grid, i, j+1);
        bfs(grid, i, j-1);
        return;
    }
}
