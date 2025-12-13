class Solution {
    public int[] findColumnWidth(int[][] grid) {
       int[] ans=new int[grid[0].length];
       for(int i=0; i<grid[0].length; i++){
           for(int j=0; j<grid.length; j++){
               String s=Integer.toString(grid[j][i]);
               int len=s.length();
               if(len>ans[i]) ans[i]=len;
           }
       }  
       return ans;
    }
}
