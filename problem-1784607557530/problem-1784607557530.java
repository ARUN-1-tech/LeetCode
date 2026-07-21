// Last updated: 7/21/2026, 9:49:17 AM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int i = 0, j = s.length() - 1;
4        while (i < j) {
5            if (!Character.isLetterOrDigit(s.charAt(i)))
6                i++;
7            else if (!Character.isLetterOrDigit(s.charAt(j)))
8                j--;
9            else {
10                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
11                    return false;
12                }
13                i++;
14                j--;
15            }
16        }
17        return true;
18    }
19}