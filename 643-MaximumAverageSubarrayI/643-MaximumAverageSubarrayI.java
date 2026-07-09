// Last updated: 7/9/2026, 10:04:24 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        if(n==1) return (double)nums[0];
        int j=k-1;
        double a=Double.NEGATIVE_INFINITY;
        while(j<n){
            int s=0;
            int i=j-k+1;
            while(i<=j){
                s+=nums[i];
                i++;
            }
            a=Math.max(a,s);
            j++;
        }
        return (double) a/k;
    }
}