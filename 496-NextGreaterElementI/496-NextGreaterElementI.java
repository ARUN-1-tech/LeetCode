// Last updated: 7/9/2026, 10:04:36 AM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums2){
            while(!st.isEmpty() && st.peek()<n) map.put(st.pop(),n);
            st.push(n);
        }
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])) ans[i]=map.get(nums1[i]);
            else ans[i]=-1;
        }
        return ans;
    }
}