// Last updated: 7/9/2026, 10:05:21 AM
class Solution {
    public int addDigits(int num) {
        if(num/10==0) return num;
        return addDigits(num%10 + addDigits(num/10));
    }
}