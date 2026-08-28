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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        if(root==null)
        return res;
        Queue<TreeNode>pq=new LinkedList<>();
        pq.offer(root);
        while(!pq.isEmpty())
        {
            List<Integer>arr=new ArrayList<>();

            int s=pq.size();
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
                arr.add(pq.poll().val);



            }
            res.add(arr);

        }
        return res;

        
    }
}