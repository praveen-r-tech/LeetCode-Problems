class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
      int n=mat.length; 
      int r0=0,r1=0,r2=0,r3=0;
      for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(target[i][j]==mat[i][j]) r0++;
            if(target[i][j]==mat[n-j-1][i]) r1++;
            if(target[i][j]==mat[j][n-i-1]) r2++;
            if(target[i][j]==mat[n-i-1][n-j-1]) r3++;
        }
      }
      if(r0==n*n||r1==n*n||r2==n*n||r3==n*n) return true;
      return false;
    }
}
