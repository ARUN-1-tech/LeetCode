// Last updated: 7/9/2026, 10:03:40 AM
class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] in = new int[N+1];
        int[] out = new int[N+1];
        Arrays.fill(in,0);
        Arrays.fill(out,0);
        for (int i=0;i<trust.length;i++) {
            out[trust[i][0]]++;
            in[trust[i][1]]++;
        }
        for (int i = 1; i <= N; ++i) {
            if (in[i] == N - 1 && out[i]==0) return i;
        }
        return -1;
    }
}