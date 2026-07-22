// Last updated: 7/22/2026, 8:59:15 AM
1class Solution {
2    public boolean removeOneChar(String s,int left, int right){
3        while(left<=right){
4            if(s.charAt(left)!=s.charAt(right)){
5                return false;
6            }
7            else{
8                left++;
9                right--;
10            }
11        }
12        return true;
13    }
14    public boolean validPalindrome(String s) {
15        int left=0;
16        int right=s.length()-1;
17        while(left<=right){
18            if(s.charAt(left)!=s.charAt(right)){
19                return removeOneChar(s,left+1,right) || removeOneChar(s,left,right-1)  ;
20            }
21            else{
22                left++;
23                right--;
24            }
25        }
26        return true;
27    }
28}