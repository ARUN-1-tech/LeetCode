// Last updated: 7/9/2026, 10:05:06 AM
class Solution {
    public boolean canConstruct(String r, String m) {
        if(r.length()>m.length()) return false;
        int[] c=new int[26];
        for(int i=0;i<m.length();i++){
            c[m.charAt(i)-'a']++;
        }for(int i=0;i<r.length();i++){
            if(c[r.charAt(i)-'a']==0) return false;
            else c[r.charAt(i)-'a']--;
        }
        return true;
    }
}