// Last updated: 7/14/2026, 10:19:01 AM
class Solution {
    public void moveZeroes(int[] nums) {

        int k = 0;

        for(int num : nums){

            if(num != 0){
                nums[k++] = num;
            }
        }

        while(k < nums.length){
            nums[k++] = 0;
        }
    }
}