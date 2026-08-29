class Solution {
    int idx;

    public TreeNode helper(int[] inorder, int[] postorder, int start, int end) {

        if (start > end) {
            return null;
        }

        int rootval = postorder[idx];
        idx--;

        int i = start;

        for (; i <= end; i++) {
            if (rootval == inorder[i]) {
                break;
            }
        }

        TreeNode root = new TreeNode(rootval);

        // Postorder ko right se left read kar rahe hain
        root.right = helper(inorder, postorder, i + 1, end);

        root.left = helper(inorder, postorder, start, i - 1);

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        int n = inorder.length;
        idx = n - 1;

        return helper(inorder, postorder, 0, n - 1);
    }
}