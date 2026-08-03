// Last updated: 8/3/2026, 2:41:16 PM
1class Solution {
2    public String reverseVowels(String s) {
3        String v="aeiouAEIOU";
4        int i=0,j=s.length()-1;
5        char[] ans=s.toCharArray();
6        while(i<j){
7            while(i<j && v.indexOf(ans[i])==-1) i++;
8            while(i<j && v.indexOf(ans[j])==-1) j--;
9            char c=ans[i];
10            ans[i]=ans[j];
11            ans[j]=c;
12            i++;j--;
13        }
14        return new String(ans);
15    }
16}