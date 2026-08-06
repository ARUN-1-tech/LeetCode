// Last updated: 8/6/2026, 2:48:37 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> children;
6
7    public Node() {}
8
9    public Node(int _val) {
10        val = _val;
11    }
12
13    public Node(int _val, List<Node> _children) {
14        val = _val;
15        children = _children;
16    }
17};
18*/
19
20class Solution {
21    List<Integer> ans = new ArrayList<>();
22    public List<Integer> preorder(Node root) {
23        if (root == null) return ans;
24        ans.add(root.val);
25        for (Node child : root.children)
26            preorder(child);
27        return ans;
28    }
29}