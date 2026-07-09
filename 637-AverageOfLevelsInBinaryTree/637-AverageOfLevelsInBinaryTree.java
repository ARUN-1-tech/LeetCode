// Last updated: 7/9/2026, 10:04:25 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {

    // DFS
    //     List<Integer> c=new ArrayList<>();
        List<Double> s=new ArrayList<>();
    //     dfs(root,0,s,c);
    //     for(int i=0;i<s.size();i++){
    //         s.set(i,s.get(i)/c.get(i));
    //     }
    //     return s;
    // }
    // public void dfs(TreeNode root,int level,List<Double> s,List<Integer> c){
    //     if(root==null) return;
    //     if(level<s.size()){
    //         c.set(level,c.get(level)+1);
    //         s.set(level,s.get(level)+root.val);
    //     }else{
    //         c.add(1);
    //         s.add(root.val*1.0);
    //     }
    //     dfs(root.left,level+1,s,c);
    //     dfs(root.right,level+1,s,c);
    // }

    // BFS 
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            Double sum=0.0;
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                sum+=temp.val;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            s.add(sum/size);
        }
        return s;
    }
}