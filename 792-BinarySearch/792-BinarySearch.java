// Last updated: 7/9/2026, 10:04:05 AM
class Solution {
    public int search(int[] nums, int target) {
        int a=nums.length;
        int i=0,j=a-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return -1;
    }
}