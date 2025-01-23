class Solution {
    public int countServers(int[][] grid) {
        int r = grid.length, c = r > 0 ? grid[0].length : 0, count = 0;

        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                if (grid[i][j] == 1) {
                    boolean found = false;
                    for (int k = 0; k < c; ++k) {
                        if (k != j && grid[i][k] == 1) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        count++;
                    } else {
                        for (int k = 0; k < r; ++k) {
                            if (k != i && grid[k][j] == 1) {
                                found = true;
                                break;
                            }
                        }
                        if (found) count++;
                    }
                }
            }
        }
        return count;
    }
}
