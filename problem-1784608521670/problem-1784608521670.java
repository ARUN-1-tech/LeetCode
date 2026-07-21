// Last updated: 7/21/2026, 10:05:21 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()<t.length()) return false;
4        Map<Character,Integer> map=new HashMap<>();
5        int i=0,j=0;
6        while(i<s.length()){
7            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
8            i++;
9        }
10        while(j<t.length()){
11            if(!map.containsKey(t.charAt(j))) map.put(t.charAt(j),1);
12            else map.put(t.charAt(j), map.get(t.charAt(j))-1);
13            j++;
14        }
15        for(int a:map.values()){
16            if(a!=0) return false;
17        }
18        return true;
19    }
20}