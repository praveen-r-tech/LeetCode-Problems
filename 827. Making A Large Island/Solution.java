class Solution {
    int[][] diff= {{1,0},{-1,0},{0,1},{0,-1}};
private void dfs(int r,int c,int row,int col,int grid[][],boolean vis[][],int count) {
      vis[row][col]=true;
      grid[row][col]= count;
      for(int i=0; i<4; i++){
        int ar= row+diff[i][0];
        int ac= col+diff[i][1];
        if(ar>=0 && ar<r && ac>=0 && ac<c && !vis[ar][ac] && grid[ar][ac]==1){
           dfs(r,c,ar,ac,grid,vis,count);
        }
      }
   }
    public int largestIsland(int[][] grid) {
       int count=0;
       int r= grid.length;
       int c= grid[0].length;
       boolean vis[][]= new boolean[r][c];
       for(int row=0; row<r; row++){
        for(int col=0; col<c; col++){
          if(grid[row][col]==1 && !vis[row][col]){
            dfs(r,c,row,col,grid,vis,++count);
          }
        }
       }
       int ct[]= new int[count+1];
       for(int row=0; row<r; row++){
        for(int col=0; col<c; col++){
          ct[grid[row][col]]++;
        }
       }
       int maxSize= 0;
       for(int isl=1; isl<ct.length; isl++){
          maxSize= Math.max(maxSize, ct[isl]);
       }
       for(int row=0; row<r; row++){
        for(int col=0; col<c; col++){
          if(grid[row][col]==0){
            Set<Integer> adjIsl= new HashSet<>();
            for(int i=0; i<4; i++){
                int ar= row+diff[i][0];
                int ac= col+diff[i][1];
                if(ar>=0 && ar<r && ac>=0 && ac<c && grid[ar][ac]!=0){
                    adjIsl.add(grid[ar][ac]);
                }
            }
            int currMerge= 1;
            for(int isl: adjIsl){
                currMerge+= ct[isl];
            }
            maxSize= Math.max(currMerge, maxSize);
          }
        }
       }
       return maxSize;
    }
}
