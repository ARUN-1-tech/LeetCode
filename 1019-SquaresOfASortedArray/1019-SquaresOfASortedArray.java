// Last updated: 7/9/2026, 10:03:46 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int i=0,j=n-1,k=n-1;
        while(i<=j){
            if(nums[i]*nums[i] > nums[j]*nums[j]){
                arr[k]=nums[i]*nums[i];
                i++;
            }
            else{
                arr[k]=nums[j]*nums[j];
                j--;
            }
            k--;
        }
        return arr;
    }
}