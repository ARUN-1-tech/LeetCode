// Last updated: 7/9/2026, 10:05:46 AM
class Solution {
    public int next(int n){
        int s=0;
        while(n>0){
            s+=(n%10) * (n%10);
            n=n/10;
        }
        return s;
    }
    public boolean isHappy(int n) {
        if(n==1) return true;
        int sl=n;
        int fa=next(n);
        while(sl!=fa){
            fa=next(fa);
            fa=next(fa);
            sl=next(sl);
            if(fa==1 || sl==1) return true;
        }
        return false;
    }
}