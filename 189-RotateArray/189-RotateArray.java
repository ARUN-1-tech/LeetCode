// Last updated: 7/20/2026, 3:09:40 PM
1class Solution {
2    public boolean uniqueOccurrences(int[] arr) {
3        Map<Integer,Integer> map=new HashMap<>();
4        for(int n:arr){
5                map.put(n,map.getOrDefault(n,0)+1);
6        }
7        Set<Integer> set=new HashSet<>();
8        for(int val:map.values()){
9            if(set.contains(val)){
10                return false;
11            }
12            set.add(val);
13        }
14        return true;
15
16    }
17}