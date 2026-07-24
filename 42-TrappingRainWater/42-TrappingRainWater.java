// Last updated: 7/24/2026, 1:58:19 PM
1class Solution {
2    public int removePalindromeSub(String s) {
3        int i=0,j=s.length()-1;
4        if(s.length()==0) return 0;
5        while(i<=j){
6            if(s.charAt(i)!=s.charAt(j)) return 2;
7            i++;j--;
8        }
9        return 1;
10    }
11}