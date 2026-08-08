// Last updated: 8/8/2026, 10:03:19 AM
1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        String full=s+s;
4        String sub=full.substring(1,full.length()-1);
5        return sub.contains(s);
6    }
7}