// Last updated: 7/29/2026, 9:33:37 AM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        Set<Integer> map1=new HashSet<>();
4        Set<Integer> map2=new HashSet<>();
5        List<Integer> ans=new ArrayList<>();
6        for(int num:nums1){
7            if(!map1.contains(num)) map1.add(num);
8        }
9        for(int n:nums2){
10            if(!map2.contains(n)) map2.add(n);
11        }
12        for(int num:map1){
13            if(map2.contains(num)) ans.add(num);
14        }
15        int[] result = new int[ans.size()];
16        for (int i = 0; i < ans.size(); i++) {
17            result[i] = ans.get(i);
18        }
19        return result;
20    }
21}