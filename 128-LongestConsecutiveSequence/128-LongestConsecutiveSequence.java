// Last updated: 7/9/2026, 10:06:44 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        Set<Integer> map=new HashSet<>();
        for(int num:nums){
            map.add(num);
        }
        int i=0;
        for(int a:map){
            if(!map.contains(a-1)){
                int cur=a;
                int str=1;
                while(map.contains(cur+1)){
                    cur++;
                    str++;
                }
                i=Math.max(i,str);
            }
        }
        return i;
    }
}