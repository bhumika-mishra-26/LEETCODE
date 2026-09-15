class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
     
        
    
        int[][] temp = new int[n][n];

        // Row shifts
        for (int i = 0; i < n; i++) {

            int k = rowShift[i];

            for (int j = 0; j < n; j++) {
                temp[i][(j - k + n) % n] = grid[i][j];
            }
        }

        // Copy temp to grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = temp[i][j];
            }
        }

        // Column shifts
        for (int j = 0; j < n; j++) {

            int k = colShift[j];

            for (int i = 0; i < n; i++) {
                temp[(i - k + n) % n][j] = grid[i][j];
            }
        }

        return temp;
    }
      }
