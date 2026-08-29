/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    //dekho isme 2 cases honge pehle case mai root.left aur root right se p and q mil jayenge then the answer will be root aur agar left se null aur right se q mil jaata h to answer hoga jo non null valye hogi vhi answer hoga 

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
        return null;
        if(root==p || root==q)
        {
            return root;

        }
        TreeNode lh=lowestCommonAncestor(root.left,p,q);
         TreeNode rh=lowestCommonAncestor(root.right,p,q);
         if(lh!=null && rh!=null)
         return root;
         if(lh!=null)
         return lh;
         else
        return rh;
        

    }
}