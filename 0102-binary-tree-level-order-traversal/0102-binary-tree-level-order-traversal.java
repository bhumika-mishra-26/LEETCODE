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
        List<List<Integer>>arr=new ArrayList<>();
        Queue<TreeNode >pq=new LinkedList<>();
        pq.offer(root);
        if(root==null)
        return arr;

        while(!pq.isEmpty())
        {
int s=pq.size();
List<Integer>ans=new ArrayList<>();

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
    ans.add(pq.poll().val);

    
}
arr.add(ans);

        }
        return arr;
        
    }
}