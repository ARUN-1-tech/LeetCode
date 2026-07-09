// Last updated: 7/9/2026, 10:04:48 AM
class Solution {
    public int minMoves(int[] nums) {
        int minElement = Arrays.stream(nums).min().getAsInt();
        int moves = 0;
        
        for (int num : nums) {
            moves += (num - minElement);
        }
        
        return moves;
    }
}