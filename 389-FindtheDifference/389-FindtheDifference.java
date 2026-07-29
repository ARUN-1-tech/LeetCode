// Last updated: 7/29/2026, 9:37:33 AM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        Set<Integer> map=new HashSet<>();
4        List<Integer> ans=new ArrayList<>();
5        for(int num:nums2) map.add(num);
6        for(int num:nums1){
7            if(map.contains(num)) {
8                ans.add(num);
9                map.remove(num);
10            }
11        }
12        int[] result = new int[ans.size()];
13        for (int i = 0; i < ans.size(); i++) {
14            result[i] = ans.get(i);
15        }
16        return result;
17    }
18}