// Last updated: 7/10/2026, 2:36:55 PM
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
17    public void dfs(TreeNode root,List<Integer> ans){
18        if(root==null) return;
19        dfs(root.left,ans);
20        ans.add(root.val);
21        dfs(root.right,ans);
22    }
23    public List<Integer> inorderTraversal(TreeNode root) {
24        List<Integer> ans=new ArrayList<>();
25        dfs(root,ans);
26        return ans;
27    }
28}