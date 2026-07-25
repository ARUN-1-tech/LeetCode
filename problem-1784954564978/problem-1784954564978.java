// Last updated: 7/25/2026, 10:12:44 AM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        // String[] arr=s.trim().split(" ");
4        // return arr[arr.length-1].length();
5        int i=s.length()-1,j=s.length()-1;
6        while(i>0){
7            if((s.charAt(i)!=' ')&&(s.charAt(i-1)==' ')) break;
8            if(s.charAt(j)==' ') j--;
9            else i--;
10        }
11        return j-i+1;
12    }
13}