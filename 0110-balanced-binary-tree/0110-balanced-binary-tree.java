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
    //  1. isme pehle ye find kro ki jo left aur right subtree hoga uski height kya hogi kyuki tabhi we can find whether a tree is balanced or not 

//  2.fir jab left height aur right height nikal jaye then find kro ki vo balanced h ya nhi 
public int height(TreeNode root)
{
    if(root==null)
    return 0;
    int lh=height(root.left);
    int rh=height(root.right);
    return Math.max(lh,rh)+1;
    

}
    public boolean isBalanced(TreeNode root) {
        if(root==null)
        return true;
        int lh=height(root.left);
        int rh=height(root.right);
        if(Math.abs(lh-rh)>1)
        return false;
        //matlab iske aage we need not check for any tree 
        return isBalanced(root.left) && isBalanced(root.right);

    }
}