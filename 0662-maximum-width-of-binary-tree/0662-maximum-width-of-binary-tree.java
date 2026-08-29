class Pair {
    int idx;
    TreeNode node;

    Pair(int idx, TreeNode node) {
        this.idx = idx;
        this.node = node;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {

        if (root == null)
            return 0;

        int maxi = 0;

        Queue<Pair> pq = new LinkedList<>();

        pq.offer(new Pair(0, root));

        while (!pq.isEmpty()) {

            int s = pq.size();

            // First node of current level
            int first = pq.peek().idx;

            int last = 0;

            for (int i = 0; i < s; i++) {

                Pair b = pq.poll();

                last = b.idx;

                if (b.node.left != null) {
                    pq.offer(new Pair(
                        2 * b.idx + 1,
                        b.node.left
                    ));
                }

                if (b.node.right != null) {
                    pq.offer(new Pair(
                        2 * b.idx + 2,
                        b.node.right
                    ));
                }
            }

            maxi = Math.max(maxi, last - first + 1);
        }

        return maxi;
    }
}