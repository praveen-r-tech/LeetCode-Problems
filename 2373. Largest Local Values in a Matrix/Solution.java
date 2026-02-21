class Solution {

    static int fun(int[][] g, int i, int j){
        int max=0;
        for(int r=i; r<i+3; r++){
            for(int c=j; c<j+3; c++){
                if(g[r][c]>max) max=g[r][c];
            }
        }
        return max;
    }

    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] maxLocal=new int[n-2][n-2];
        for(int i=0; i<n-2; i++){
            for(int j=0; j<n-2; j++){
                maxLocal[i][j]=fun(grid,i,j);
            }
        }
        return maxLocal;
    }
}
