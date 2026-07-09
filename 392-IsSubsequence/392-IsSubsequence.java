// Last updated: 7/9/2026, 10:05:02 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j<t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else
                j++;
        }
        if (i == s.length())
            return true;
        return false;
    }
}