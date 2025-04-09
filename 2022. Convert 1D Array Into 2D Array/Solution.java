class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int dm= m*n;
        if(dm!= original.length){
            return new int[0][0];
        }
        int idx=0;
        int[][] mtx= new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mtx[i][j]=original[idx++];
            }
        }
        return mtx;
    }
}
