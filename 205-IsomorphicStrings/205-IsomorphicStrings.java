// Last updated: 7/23/2026, 2:40:13 PM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        Map<Character,Character> map=new HashMap<>();
4        for(int i=0;i<s.length();i++){
5            char a=s.charAt(i);
6            char b=t.charAt(i);
7            if(!map.containsKey(a)){
8                if(map.containsValue(b)) return false;
9                map.put(a,b);
10            }else{
11                if(map.get(a)!=b) return false;
12            }
13        }
14        return true;
15    }
16}