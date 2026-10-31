class Solution {
    int MOD=1_000_000_007;
    Long[][][] dp;

    public int uniquePaths(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        dp=new Long[m][n][2];
        return (int)dfs(0,0,0,grid);
    }

    public long dfs(int i,int j,int dir,int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        if(i>=m || j>=n) return 0;

        if(grid[i][j]==1) {
            if(dir==0) return dfs(i+1,j,1,grid);
            return dfs(i,j+1,0,grid);
        }

        if(i==m-1 && j==n-1) return 1;

        if(dp[i][j][dir]!=null) return dp[i][j][dir];

        long right=dfs(i,j+1,0,grid);
        long down=dfs(i+1,j,1,grid);

        return dp[i][j][dir]=(right+down)%MOD;
    }
}