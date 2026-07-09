// Last updated: 7/9/2026, 10:02:55 AM
class Solution {
    public boolean checkGoodInteger(int n) {
        int digit=0,square=0;
        while(n>0){
            int d=n%10;
            digit+=d;
            square+=d*d;
            n=n/10;
        }
        return(square-digit)>=50;
    }
}