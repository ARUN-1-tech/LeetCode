// Last updated: 7/9/2026, 10:08:53 AM
class Solution {
    public boolean isPalindrome(int x) {
        int r=0;
        int t=x;
        while(t>0){
            r=r*10+t%10;
            t/=10;
        }
        return (r==x) ? true:false;
    }
}