// Last updated: 7/24/2026, 3:10:43 PM
1class Solution {
2    public int minSteps(String s, String t) {
3        int n=s.length();
4        int m=t.length();
5        if(n!=m) return -1;
6        int c=0;
7        int[] sa=new int[26];
8        for(int i=0;i<n;i++){
9            sa[s.charAt(i)-'a']++;
10            sa[t.charAt(i)-'a']--;
11        }
12        for(int i=0;i<26;i++){
13            if(sa[i]>0) c+=sa[i];
14        }
15        return c;
16    }
17}