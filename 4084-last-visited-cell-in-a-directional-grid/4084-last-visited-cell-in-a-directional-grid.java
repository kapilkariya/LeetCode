class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int i=0;
        int j=0;
        while(true){
            if(grid[i][j]=='X') return new int[]{i,j};
            int x=i;
            int y=j;
            if(grid[i][j]=='D' && i<grid.length-1 && grid[i+1][j]!='X') i++; 
            else if(grid[i][j]=='U' && i>0 && grid[i-1][j]!='X') i--; 
            else if(grid[i][j]=='L' && j>0 && grid[i][j-1]!='X') j--; 
            else if(grid[i][j]=='R' && j<grid[0].length-1 && grid[i][j+1]!='X') j++; 
            grid[x][y]='X';
        }
    }
}