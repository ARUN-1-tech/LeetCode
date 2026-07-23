// Last updated: 7/23/2026, 9:35:53 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int i=0,j=nums.length-1;
4        while(i<=j){
5            int mid=(i+j)/2;
6            if(nums[mid]==target) return mid;
7            if (nums[i] <= nums[mid]) {
8                if (nums[i] <= target && target < nums[mid]) {
9                    j = mid - 1;
10                } else {
11                    i = mid + 1;
12                }
13            } else {
14                if (nums[mid] < target && target <= nums[j]) {
15                    i = mid + 1;
16                } else {
17                    j = mid - 1;
18                }
19            }
20        }
21        return -1;
22    }
23}