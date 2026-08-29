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
    public void check(TreeNode root,List<String>path,String res)
    {
             if (root == null)
            return;

        if(root.left==null && root.right==null)
        {
            path.add(res+root.val);
            return ;

        }
        if(root.left!=null)
        {
            check(root.left,path,res+root.val+"->");

        }
           if(root.right!=null)
        {
            check(root.right,path,res+root.val+"->");
            
        }

    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>path=new ArrayList<>();
        
        check(root,path,"");
        return path;

        
    }
}