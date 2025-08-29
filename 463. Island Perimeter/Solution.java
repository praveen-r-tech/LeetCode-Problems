class Solution {
    public int islandPerimeter(int[][] grid) {
       int pm=0;
       int[] dx={-1,0};
       int[] dy={0,-1};
       for(int i=0; i<grid.length; i++){
          for(int j=0; j<grid[0].length; j++){
            if(grid[i][j]==1){
                pm+=4;
                for(int d=0; d<2; d++){
                    int x= i+dx[d];
                    int y= j+dy[d];
                    if(x>=0 && y>=0){
                        if(grid[x][y]==1){
                            pm-=2;
                        }
                    }
                }
            }
          }
       } 
       return pm;
    }
}
