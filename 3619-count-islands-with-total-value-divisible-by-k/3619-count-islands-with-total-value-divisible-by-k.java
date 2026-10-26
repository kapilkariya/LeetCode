class Solution {
    public int countIslands(int[][] grid, int k) {
        int ct=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]>0 && dfs(grid,k,i,j)%k==0) ct++;
            }
        }
        return ct;
    }
    public long dfs(int[][] arr,int k,int i,int j){
        long ans=(long)arr[i][j];
        arr[i][j]=-1;
        if(i>0 && arr[i-1][j]>0) ans+=dfs(arr,k,i-1,j);
        if(i<arr.length-1 && arr[i+1][j]>0) ans+=dfs(arr,k,i+1,j);
        if(j>0 && arr[i][j-1]>0) ans+=dfs(arr,k,i,j-1);
        if(j<arr[0].length-1 && arr[i][j+1]>0) ans+=dfs(arr,k,i,j+1);
        return ans;
    }
}