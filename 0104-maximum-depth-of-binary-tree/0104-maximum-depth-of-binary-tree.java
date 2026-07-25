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
    public int maxDepth(TreeNode root) {
    // isme do recursive call for lef tsubtree and right subtree 

    //max depth will be dono ka max +1 for each node 
    if(root==null)
    return 0;
    int lh=maxDepth(root.left);
    int rh=maxDepth(root.right);
    return 1+Math.max(lh,rh);
    
        
    }
}