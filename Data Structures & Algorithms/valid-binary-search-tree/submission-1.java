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
    public boolean isValidBST(TreeNode root) {
    //DFS APPROACH    
    return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
        //(root, - infifity, + infinity)
    }

    public boolean valid(TreeNode node, long left, long right){
        if(node == null){
            return true;
        }

        if(!(left < node.val && node.val < right)){
            return false;
        }

        return valid(node.left, left, node.val) &&  // current node.val becomes the new max
               valid(node.right, node.val, right); // current node.val becomes the new min

    }



}
