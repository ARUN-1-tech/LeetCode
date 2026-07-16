// Last updated: 7/16/2026, 10:46:31 AM
1class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3        Map<Integer,Long> map=new HashMap<>();
4        long c=0,m=Long.MIN_VALUE,cou=0;
5        for(int num:nums){
6            c+=num;
7            if(map.containsKey(num-k)){
8                m=Math.max(m,c-map.get(num-k));
9            }
10            if(map.containsKey(num+k)){
11                m=Math.max(m,c-map.get(num+k));
12            }
13            if(!map.containsKey(num) || (c - num) < map.get(num)){
14                map.put(num,c-num);
15            }
16        }
17        return m==Long.MIN_VALUE?0:m;
18    }
19}