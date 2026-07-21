// Last updated: 7/21/2026, 9:28:24 AM
1class Solution {
2    public boolean isPalindrome(String s) {
3        String ans="";
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            if(Character.isLetterOrDigit(ch)) ans+=Character.toLowerCase(ch);
7        }
8        int i=0,j=ans.length()-1;
9        while(i<j){
10            if(ans.charAt(i)!=ans.charAt(j)) return false;
11            i++;j--;
12        }
13        return true;
14    }
15}