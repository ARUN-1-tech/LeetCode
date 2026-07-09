// Last updated: 7/9/2026, 10:03:35 AM
class Solution {
    public boolean divisorGame(int N) {
        boolean[] dp = new boolean[N+1];
        for(int i = 2; i <= N; i++) {
            for(int j = 1; j <= Math.sqrt(i); j++) {
                if((i % j == 0) && (dp[i-j] == false)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[N];
    }
}