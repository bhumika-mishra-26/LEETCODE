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
    public List<Integer> largestValues(TreeNode root) {
     
        List<Integer>ans=new ArrayList<>();
           if(root==null)
        return ans;
        Queue<TreeNode>pq=new LinkedList<>();
        pq.offer(root);
        while(!pq.isEmpty())
        {
            int size_p=pq.size();
            int maxi=Integer.MIN_VALUE;
            for(int i=0;i<size_p;i++)
            {

            TreeNode p=pq.poll();
            maxi=Math.max(p.val,maxi);

            if(p.left!=null)
            pq.offer(p.left);
             if(p.right!=null)
            pq.offer(p.right);
            }
            ans.add(maxi);


        }


       return ans;

    }
}