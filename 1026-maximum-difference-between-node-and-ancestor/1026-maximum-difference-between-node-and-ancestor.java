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

    public int  dfs(TreeNode root, int mini, int maxi)

    {
        if (root == null)
            return maxi - mini;

        maxi = Math.max(maxi, root.val);
        mini = Math.min(mini, root.val);
        return Math.max(dfs(root.left, mini, maxi), dfs(root.right, mini, maxi));

    }

    public int maxAncestorDiff(TreeNode root) {
        if (root == null)
            return 0;
        return dfs(root, root.val, root.val);

    }
}