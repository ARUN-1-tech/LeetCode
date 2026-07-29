// Last updated: 7/29/2026, 9:47:22 AM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        int i=0,j=0,k=0;
4        Arrays.sort(nums1);
5        Arrays.sort(nums2);
6        while(i<nums1.length && j<nums2.length){
7            if(nums1[i]>nums2[j]) j++;
8            else if(nums1[i]<nums2[j]) i++;
9            else{
10                nums1[k++]=nums1[i++];
11                j++;
12            }
13        }
14        int[] result = new int[k];
15        for (int z = 0; z < k; z++) {
16            result[z] = nums1[z];
17        }
18        return result;
19    }
20}