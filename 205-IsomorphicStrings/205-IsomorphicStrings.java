// Last updated: 7/23/2026, 3:39:17 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        int[] ans=new int[26];
4        for(int i=0;i<s.length();i++){
5            ans[s.charAt(i)-'a']++;
6        }
7        for(int i=0;i<s.length();i++){
8            if(ans[s.charAt(i)-'a']==1) return i;
9        }
10        return -1;
11    }
12}