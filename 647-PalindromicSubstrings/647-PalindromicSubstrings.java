// Last updated: 7/22/2026, 11:28:30 AM
1class Solution {
2    public int countSubstrings(String s) {
3        int ans = 0;
4        for (int i = 0; i < s.length(); i++) {
5            ans += abc(s, i, i);
6            ans += abc(s, i, i + 1);
7        }
8        return ans;
9    }
10    public int abc(String s, int l, int r) {
11        int c = 0;
12        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
13            c++;
14            l--;
15            r++;
16        }
17        return c;
18    }
19}