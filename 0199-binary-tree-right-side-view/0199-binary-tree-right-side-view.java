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
        List<Integer>ans=new ArrayList<>();
                if (root == null)
            return ans;
        Queue<TreeNode>pq=new LinkedList<>();
        pq.offer(root);
        while(!pq.isEmpty())
        {
            int s=pq.size();
            TreeNode right=null;
            for(int i=0;i<s;i++)
            {
                if(pq.peek().left!=null)
                {
                    pq.offer(pq.peek().left);

                }
                 if(pq.peek().right!=null)
                {
                    pq.offer(pq.peek().right);
                    
                }
                right=pq.poll();

            }
            ans.add(right.val);

        }
        return ans;

    }
}