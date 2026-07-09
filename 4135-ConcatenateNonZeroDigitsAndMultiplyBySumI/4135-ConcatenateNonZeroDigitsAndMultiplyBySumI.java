// Last updated: 7/9/2026, 10:02:52 AM
class Solution {
    public long sumAndMultiply(int n) {
        long x=0,a=0,s=0;
        while(n>0){
            if(n%10!=0) {
                x=(x*10)+(n%10);
                s+=n%10;
                n=n/10;
            }else{
                n=n/10;
            }
        }
        while(x>0){
            a=(a*10)+(x%10);
            x=x/10;
        }
        return a*s;
    }
}