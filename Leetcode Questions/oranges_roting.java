class oranges_roting {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) q.offer(new int[]{i, j});
                else if (grid[i][j] == 1) fresh++;
            }
        }

        if (fresh == 0) return 0;

        int time = 0;
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

        
        while (!q.isEmpty()) {
            int size = q.size();
            boolean rotted = false;

            for (int i = 0; i < size; i++) {
                int[] cur = q.poll();
                for (int[] d : dir) {
                    int ni = cur[0] + d[0];
                    int nj = cur[1] + d[1];

                    if (ni >= 0 && nj >= 0 && ni < rows && nj < cols && grid[ni][nj] == 1) {
                        grid[ni][nj] = 2;
                        fresh--;
                        q.offer(new int[]{ni, nj});
                        rotted = true;
                    }
                }
            }
            if (rotted) time++;
        }

        return fresh == 0 ? time : -1;
    }
}
