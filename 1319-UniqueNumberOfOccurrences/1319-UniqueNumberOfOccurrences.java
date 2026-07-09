// Last updated: 7/9/2026, 10:03:25 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (int freq : map.values()) {
            if (!set.add(freq)) {
                return false;
            }
        }
        return true;
    }
}