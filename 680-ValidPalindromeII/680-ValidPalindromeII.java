// Last updated: 7/22/2026, 11:35:14 AM
1class Solution {
2    public boolean abc(String s, int l,int r){
3        while(l<=r){
4            if(s.charAt(l)!=s.charAt(r)) return false;
5            else l++;r--;
6        }
7        return true;
8    }
9    public boolean validPalindrome(String s) {
10        int l=0,r=s.length()-1;
11        while(l<=r){
12            if(s.charAt(l)!=s.charAt(r)){
13                return abc(s,l,r-1) || abc(s,l+1,r);
14            }
15            else l++;r--;
16        }
17        return true;
18    }
19}