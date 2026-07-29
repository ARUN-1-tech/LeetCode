// Last updated: 7/29/2026, 9:20:51 AM
1class Solution {
2    public char findTheDifference(String s, String t) {
3        int su=0,d=0;
4        for(int i:t.toCharArray()){
5            su+=i-'a';
6        }
7        for(int j:s.toCharArray()){
8            d+=j-'a';
9        }
10        return (char)(su-d+'a');
11    }
12}