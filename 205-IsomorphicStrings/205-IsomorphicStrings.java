// Last updated: 7/23/2026, 3:12:01 PM
1class Solution {
2    public boolean canConstruct(String r, String m) {
3        if(r.length()>m.length()) return false;
4        int[] ans=new int[26];
5        for(int i=0;i<m.length();i++){
6            ans[m.charAt(i)-'a']++;
7        }
8        for(int i=0;i<r.length();i++){
9            if(ans[r.charAt(i)-'a']==0) return false;
10            ans[r.charAt(i)-'a']--;
11        }
12        return true;
13    }
14}