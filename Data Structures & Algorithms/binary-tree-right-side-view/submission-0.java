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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res =new ArrayList<>();
        //if(root == null)
        Queue<TreeNode> q =new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode rightview = null;
            int qsize = q.size();
            for(int i=0;i<qsize;i++){
               TreeNode node = q.poll();
               if(node!=null){
                rightview = node;
                q.offer(node.left);
                q.offer(node.right);
                //res.add(rightview.val);
               }             
            }
            if(rightview !=null){
                res.add(rightview.val);
            }
        }
        return res;
    }
}
