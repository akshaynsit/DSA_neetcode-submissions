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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res =new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> res1 = new ArrayList<>();
            int qsize = q.size();
            for(int i=0;i<qsize;i++){
                TreeNode popped = q.poll();
                if(popped !=null){
                    q.offer(popped.left);
                    q.offer(popped.right);
                    res1.add(popped.val);
                }
                
            }
            if(res1.size()>=1){
                res.add(res1);
            }
            
        }
        return res;
        
    }
}
