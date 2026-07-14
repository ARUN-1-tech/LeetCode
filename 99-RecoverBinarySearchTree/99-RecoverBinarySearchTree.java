// Last updated: 7/14/2026, 10:42:44 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int s=0;
18    public int findTilt(TreeNode root) {
19        dfs(root);
20        return s;
21    }
22    public int dfs(TreeNode root){
23        if(root==null) return 0;
24        int l=dfs(root.left);
25        int r=dfs(root.right);
26        s+=Math.abs(l-r);
27        return l+r+root.val;
28    }
29}