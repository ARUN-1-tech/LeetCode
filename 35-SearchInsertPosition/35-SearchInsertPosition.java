// Last updated: 7/9/2026, 10:08:04 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int a=nums.length;
        for(int i=0;i<a;i++){
            if(i<a-1){
                if((nums[i]<target) && (nums[i+1]>=target)){
                    return i+1;
                }
            }else if(target<=nums[0]){
                return 0;
            }
        }
        return a;
    }
}