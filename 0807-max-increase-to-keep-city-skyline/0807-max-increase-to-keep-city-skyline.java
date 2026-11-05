class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] col=new int[grid.length];
        int[] row=new int[grid[0].length];
        int ans=0;
        Arrays.fill(col,Integer.MIN_VALUE);
        Arrays.fill(row,Integer.MIN_VALUE);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                col[i]=Math.max(col[i],grid[i][j]);
            }
        }
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                row[i]=Math.max(row[i],grid[j][i]);
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(col[i]!=grid[i][j] && row[j]!=grid[i][j]) ans+=(Math.min(col[i],row[j])-grid[i][j]);
            }
        }
        return ans;
    }
}