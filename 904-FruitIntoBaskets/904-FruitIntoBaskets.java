// Last updated: 8/26/2026, 9:53:32 PM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        Map<Integer,Integer> map=new HashMap<>();
4        int i=0,m=0;
5        for(int j=0;j<fruits.length;j++){
6            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
7            while(map.size()>2){
8                int l=fruits[i];
9                map.put(l,map.get(l)-1);
10                if(map.get(l)==0){
11                    map.remove(l);
12                }
13                i++;
14            }
15            m=Math.max(m,j-i+1);
16        }
17        return m;
18    }
19}