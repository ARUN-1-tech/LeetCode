// Last updated: 7/15/2026, 11:09:51 AM
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        Map<Integer,Integer> map=new HashMap<>();
4        List<Integer> ans=new ArrayList<>();
5        for(int num:nums){
6            if(!map.containsKey(num)){
7                map.put(num,1);
8            }else{
9                map.put(num,map.get(num)+1);
10            }
11        }
12        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
13            if(entry.getValue() > nums.length/3) ans.add(entry.getKey());
14        }
15        return ans;
16    }
17}