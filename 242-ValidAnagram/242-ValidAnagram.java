// Last updated: 7/21/2026, 10:06:55 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        char[] arrs = s.toCharArray();
4        char[] arrt = t.toCharArray();
5        Arrays.sort(arrs);
6        Arrays.sort(arrt);
7        if (Arrays.equals(arrs, arrt))
8            return true;
9        return false;
10    }
11}