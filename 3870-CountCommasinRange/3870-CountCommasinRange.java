// Last updated: 9/8/2026, 9:54:26 AM
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        Set<Integer> st=new HashSet<>();
4        for(int i:nums){
5            st.add(i);
6        }
7        int x=k;
8        while(st.contains(x)){
9            x=x+k;
10        }
11        return x;
12    }
13}