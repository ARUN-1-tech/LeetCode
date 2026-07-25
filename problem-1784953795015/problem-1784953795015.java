// Last updated: 7/25/2026, 9:59:55 AM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        String[] arr=s.trim().split(" ");
4        return arr[arr.length-1].length();
5    }
6}