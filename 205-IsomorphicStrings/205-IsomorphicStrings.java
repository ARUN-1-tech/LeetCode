// Last updated: 7/23/2026, 2:59:26 PM
1class Solution {
2    public boolean wordPattern(String s, String t) {
3        String[] str=t.split(" ");
4        if(s.length()!=str.length) return false;
5        Map<Character,String> map=new HashMap<>();
6        for(int i=0;i<s.length();i++){
7            char a=s.charAt(i);
8            String b=str[i];
9            if(!map.containsKey(a)){
10                if(map.containsValue(b)) return false;
11                map.put(a,b);
12            }else{
13                if(!map.get(a).equals(b)) return false;
14            }
15        }
16        return true;
17    }
18}