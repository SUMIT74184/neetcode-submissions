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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null || p == null || q == null){
            return null;
        }
        //agar dono nodes left side par hain aur root ke val se kam hain toh
        if(Math.max(p.val,q.val) < root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        //dono nodes right side par hain agar root ke val se jayda hain toh
        else if(Math.min(p.val,q.val)> root.val){
            return lowestCommonAncestor(root.right,p,q);
        }else{
        // agar ek node right mein aur ek node left mein hain toh root return hoga seedha
            return root;
        }

    }
}
