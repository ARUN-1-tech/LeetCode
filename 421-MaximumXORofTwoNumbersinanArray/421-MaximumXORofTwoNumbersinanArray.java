// Last updated: 8/3/2026, 2:49:38 PM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if(s.length()!=goal.length()) return false;
4        return (s+s).contains(goal);
5    }
6}