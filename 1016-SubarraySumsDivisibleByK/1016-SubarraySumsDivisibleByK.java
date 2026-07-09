// Last updated: 7/9/2026, 10:03:49 AM
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] count = new int[k];
        count[0] = 1;
        int prefixSum = 0;
        int result = 0;
        for (int num : nums) {
            prefixSum += num;
            int remainder = prefixSum % k;
            if (remainder < 0) {
                remainder += k;
            }
            result += count[remainder];
            count[remainder]++;
        }
        return result;
    }
}