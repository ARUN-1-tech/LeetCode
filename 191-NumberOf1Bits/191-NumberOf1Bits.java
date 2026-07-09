// Last updated: 7/9/2026, 10:05:52 AM
class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n>0){
            c+=n&1;
            n=n>>>1;
        }
        return c;
    }
}