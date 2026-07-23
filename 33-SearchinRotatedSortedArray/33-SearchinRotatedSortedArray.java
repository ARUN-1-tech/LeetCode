// Last updated: 7/23/2026, 9:37:34 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        // int i = 0, j = nums.length - 1;
4        // while (i <= j) {
5        //     int mid = (i + j) / 2;
6        //     if (nums[mid] == target)
7        //         return mid;
8        //     if (nums[i] <= nums[mid]) {
9        //         if (nums[i] <= target && target < nums[mid]) {
10        //             j = mid - 1;
11        //         } else {
12        //             i = mid + 1;
13        //         }
14        //     } else {
15        //         if (nums[mid] < target && target <= nums[j]) {
16        //             i = mid + 1;
17        //         } else {
18        //             j = mid - 1;
19        //         }
20        //     }
21        // }
22        // return -1;
23
24        for(int i=0;i<nums.length;i++){
25            if(nums[i]==target) return i;
26        }
27        return -1;
28    }
29}