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
    int result=0;

    /// isme har node ki 2 rsponsibility hongi 

    // 1. pehli ki agar vo hi ans h to lh+rh 

    // 2.agar vo possible ans nhi h to upar ye result bhejdo max(lh,rh)+1;
    //  3. isme humlog edges count karenge 
    public int  solve(TreeNode root )
    {
        if(root==null)
        return 0;

        int lh=solve(root.left);
        int rh=solve(root.right);
        result=Math.max(lh+rh,result);
        return Math.max(lh,rh)+1;


    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        return 0;

        solve(root);
        return result;

        
    }
}