class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int m = image.length;
        int n = image[0].length;

        Queue<int[]> pq = new LinkedList<>();

        int[][] dir = {
            {-1, 0},
            {0, -1},
            {0, 1},
            {1, 0}
        };

        if (image[sr][sc] == color) {
            return image;
        }

        int c = image[sr][sc];

        pq.offer(new int[]{sr, sc});

        while (!pq.isEmpty()) {

            int[] p = pq.poll();

            int u = p[0];
            int v = p[1];

            image[u][v] = color;

            for (int[] d : dir) {

                int nr = u + d[0];
                int nc = v + d[1];

                if (nr >= 0 && nr < m &&
                    nc >= 0 && nc < n &&
                    image[nr][nc] == c) {

                    pq.offer(new int[]{nr, nc});
                }
            }
        }

        return image;
    }
}