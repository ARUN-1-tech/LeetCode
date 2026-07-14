// Last updated: 7/14/2026, 9:39:39 AM
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
17    TreeNode f,s,p;
18    public void recoverTree(TreeNode root) {
19        inorder(root);
20        int t=f.val;
21        f.val=s.val;
22        s.val=t;
23    }
24    public void inorder(TreeNode root){
25        if(root==null) return;
26        inorder(root.left);
27        if(p!=null && p.val>root.val){
28            if(f==null) f=p;
29            s=root;
30        }
31        p=root;
32        inorder(root.right);
33    }
34}