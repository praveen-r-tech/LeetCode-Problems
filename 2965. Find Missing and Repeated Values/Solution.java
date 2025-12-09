class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       int[] ans=new int[2];
       int n=grid.length;
       boolean[] vis=new boolean[(n*n)+1];
       for(int i=0; i<n; i++){
           for(int j=0; j<n; j++){
               if(!vis[grid[i][j]]) vis[grid[i][j]]=true;
               else ans[0]=grid[i][j];
           }
       } 
       for(int i=1; i<(n*n)+1; i++){
           if(!vis[i]) ans[1]=i; 
       }
       return ans;
    }
}
