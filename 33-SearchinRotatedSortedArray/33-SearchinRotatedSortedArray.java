// Last updated: 7/23/2026, 9:52:10 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int n=nums1.length;
4        int m=nums2.length;
5        int[] ans=new int[n+m];
6        int i=0,j=0,k=0;
7        while(i<n && j<m){
8            if(nums1[i]<nums2[j]) ans[k++]=nums1[i++];
9            else ans[k++]=nums2[j++];
10        }
11        while(i<n) ans[k++]=nums1[i++];
12        while(j<m) ans[k++]=nums2[j++];
13        if((m+n)%2==1) return ans[(m+n)/2];
14        return (ans[((m+n)/2)-1]+ans[(m+n)/2])/2.0;
15    }
16}