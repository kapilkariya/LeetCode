class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int i = 0;
        int j = 0;
        int k = 1;
        while (k <= n * n) {
            while (true) {
                if (j >= n || ans[i][j] != 0) break;
                ans[i][j++] = k++;
            }
            j--;
            i++;
            while (true) {
                if (i >= n || ans[i][j] != 0) break;
                ans[i++][j] = k++;
            }
            i--;
            j--;
            while (true) {
                if (j < 0 || ans[i][j] != 0) break;
                ans[i][j--] = k++;
            }
            j++;
            i--;
            while (true) {
                if (i < 0 || ans[i][j] != 0) break;
                ans[i--][j] = k++;
            }
            i++;
            j++;
        }
        return ans;
    }
}