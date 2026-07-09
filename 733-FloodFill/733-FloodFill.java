// Last updated: 7/9/2026, 10:04:15 AM
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length,m = image[0].length;
        boolean[][] visited = new boolean[n][m];
        int key = image[sr][sc];
        dfs(sr, sc, image, visited, key, color);
        return image;
    }
    private void dfs(int sr, int sc, int[][] image, boolean[][] visited, int key, int color) {
        int n = image.length,m = image[0].length;
        if (sr < 0 || sr >= n || sc < 0 || sc >= m || image[sr][sc] != key || visited[sr][sc]) {
            return;
        }
        visited[sr][sc] = true;
        image[sr][sc] = color;
        dfs(sr - 1, sc, image, visited, key, color); 
        dfs(sr + 1, sc, image, visited, key, color); 
        dfs(sr, sc - 1, image, visited, key, color); 
        dfs(sr, sc + 1, image, visited, key, color);
    }
}