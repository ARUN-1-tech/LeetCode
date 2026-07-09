// Last updated: 7/9/2026, 10:04:51 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        Set<Integer> map=new HashSet<>();
        for(int i=0;i<n;i++){
            if(!map.contains(nums[i])) map.add(nums[i]);
        }
        for(int i=1;i<=n;i++){
            if(!map.contains(i)) ans.add(i);
        }
        return ans;
    }
}