class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
       int[][] mat=new int[n][n];
       for(int p[]: queries){
          for(int i=p[0]; i<=p[2]; i++){
             for(int j=p[1]; j<=p[3]; j++){
                mat[i][j]++; 
             }
          }
       } 
       return mat;
    }
}
