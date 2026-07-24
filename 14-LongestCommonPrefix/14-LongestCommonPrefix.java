// Last updated: 7/24/2026, 9:58:40 AM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        Arrays.sort(strs);
4        String s="";
5        int i=0;
6        while(i<strs[0].length()){
7            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i))s+=strs[0].charAt(i);
8            else break;
9            i++;
10        }
11        return s;
12    }
13}