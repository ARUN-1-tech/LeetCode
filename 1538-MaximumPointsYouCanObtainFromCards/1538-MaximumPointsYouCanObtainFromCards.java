// Last updated: 7/9/2026, 10:03:18 AM
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        if(k==cardPoints.length){
            int sum=0;
            for(int p:cardPoints){
                sum+=p;
            }
            return sum;
        }
        int ls=0;
        for(int i=0;i<k;i++){
            ls+=cardPoints[i];
        }
        int rs=0;
        int ms=ls;
        int last=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            ls-=cardPoints[i];
            rs+=cardPoints[last];
            last--;
            ms=Math.max(ls+rs,ms);
        }
        return ms;
    }
}