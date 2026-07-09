// Last updated: 7/9/2026, 10:06:02 AM
class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(!map.containsKey(nums[i])){
        //         map.put(nums[i],1);
        //     }else{
        //         map.put(nums[i],map.get(nums[i])+1);
        //     }
        //     if (map.get(nums[i])>(nums.length)/2) {
        //         return nums[i];
        //     }
        // }
        // return -1;

        int count=0,candidate=-1;
        for(int num:nums){
            if(count==0){
                candidate=num;
            }
            count+=(candidate==num)?1:-1;
        }
        return candidate;
    }
}