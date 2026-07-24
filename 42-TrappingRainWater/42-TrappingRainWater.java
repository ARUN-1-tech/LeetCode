// Last updated: 7/24/2026, 1:48:49 PM
1class Solution {
2    public int minimumMoves(String s) {
3        int i=0,c=0;
4        while(i<s.length()){
5            if(s.charAt(i)=='X'){
6                i=i+3;
7                c++;
8            }else{
9                i++;
10            }
11        }
12        return c;
13    }
14}