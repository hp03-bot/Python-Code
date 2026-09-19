class Solution {
    public int uniquePathsWithObstacles(int[][] nums) {
        int n = nums.length, m = nums[0].length;

        if(nums[0][0] == 1) {
            return 0;
        }

        int[][] path = new int[n][m];

        for(int i = 0; i < n; i++) {
            if(nums[i][0] == 1) {
                break;
            }
            path[i][0] = 1;
        }

        for(int j = 0; j < m; j++) {
            if(nums[0][j] == 1) {
                break;
            }
            path[0][j] = 1;
        }

        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(nums[i][j] == 1) {
                    path[i][j] = 0;
                } else {
                    path[i][j] = path[i - 1][j] + path[i][j - 1];
                }
            }
        }

        return path[n - 1][m - 1];
    }
}