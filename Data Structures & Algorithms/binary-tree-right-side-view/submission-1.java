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
    List<Integer> res =new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        //using DFS
        rightview(root,0);
        //if(root == null)
        return res;

    }
    private void rightview(TreeNode node,int height){
        if(node == null)return ;
        if(res.size() == height){
            res.add(node.val);
        }
        rightview(node.right,height+1);
        rightview(node.left,height+1);
        return;
    }
}
