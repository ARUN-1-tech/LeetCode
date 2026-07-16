// Last updated: 7/16/2026, 11:42:53 AM
1class Solution {
2    public int maximumSetSize(int[] nums1, int[] nums2) {
3        Set<Integer> s1 = new HashSet(); 
4        Set<Integer> s2 = new HashSet();
5        Set<Integer> s3 = new HashSet(); 
6        for (int num: nums1){
7            s1.add(num);
8            s3.add(num);
9        } 
10        for (int num: nums2) {
11            s2.add(num);
12            s3.add(num);
13        } 
14        int a=Math.min(s1.size(), nums1.length/2);
15        int b=Math.min(s2.size(), nums2.length/2);
16        int c=s3.size();
17        return Math.min(a + b, c);                            
18    }
19}