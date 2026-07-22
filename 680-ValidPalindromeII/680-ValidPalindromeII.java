// Last updated: 7/22/2026, 9:01:09 AM
1class Solution {
2    public boolean removeOneChar(String s,int left, int right){
3        while(left<=right){
4            if(s.charAt(left)!=s.charAt(right)) return false;
5            else{
6                left++;
7                right--;
8            }
9        }
10        return true;
11    }
12    public boolean validPalindrome(String s) {
13        int left=0;
14        int right=s.length()-1;
15        while(left<=right){
16            if(s.charAt(left)!=s.charAt(right)){
17                return removeOneChar(s,left+1,right) || removeOneChar(s,left,right-1)  ;
18            }
19            else{
20                left++;
21                right--;
22            }
23        }
24        return true;
25    }
26}