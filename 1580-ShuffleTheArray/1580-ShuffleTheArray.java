// Last updated: 7/9/2026, 10:03:16 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a=nums.length;
        int[] arr=new int[a];
        int i=0,j=a/2,c=0;
        while(i<a/2){
            arr[c++]=nums[i++];
            arr[c++]=nums[j++];
        }
        return arr;
    }
}