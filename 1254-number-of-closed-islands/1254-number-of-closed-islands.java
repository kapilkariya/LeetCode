class Solution {
    public int closedIsland(int[][] grid) {
        int ct=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0) if(dfs(grid,i,j,true)) ct++;
            }
        }
        return ct;
    }
    public boolean dfs(int[][] arr,int i,int j,boolean a){
        if(i<1 || i>=arr.length-1 || j<1 || j>=arr[0].length-1) a=false;
        arr[i][j]=2;
        if(i>0 && arr[i-1][j]==0) a= dfs(arr,i-1,j,a) && a;
        if(i<arr.length-1 && arr[i+1][j]==0) a=dfs(arr,i+1,j,a) && a;
        if(j>0 && arr[i][j-1]==0) a=dfs(arr,i,j-1,a) && a;
        if(j<arr[0].length-1 && arr[i][j+1]==0) a=dfs(arr,i,j+1,a) && a;
        return a;
    }
}