// Last updated: 7/9/2026, 10:03:01 AM
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();
        long MOD = 1000000007;

        long[] pow10 = new long[n + 1];
        pow10[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        long[] P = new long[n + 1];
        long[] pref_sum = new long[n + 1];
        int[] count = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            char c = s.charAt(i - 1);
            if (c != '0') {
                int digit = c - '0';
                pref_sum[i] = pref_sum[i - 1] + digit;
                count[i] = count[i - 1] + 1;
                P[i] = (P[i - 1] * 10 + digit) % MOD;
            } else {
                pref_sum[i] = pref_sum[i - 1];
                count[i] = count[i - 1];
                P[i] = P[i - 1];
            }
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0] + 1;
            int end = queries[i][1] + 1;

            int numNonZero = count[end] - count[start - 1];
            
            long x = (P[end] - (P[start - 1] * pow10[numNonZero]) % MOD + MOD) % MOD;
            long sumDigits = pref_sum[end] - pref_sum[start - 1];

            long ans = (x * (sumDigits % MOD)) % MOD;
            result[i] = (int) ans;
        }

        return result;
    }
}
