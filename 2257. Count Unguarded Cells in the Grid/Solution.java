class Solution {

    void fun(int r, int c, int[][] g, char d){
        if(r<0 || r>=g.length || c<0 || c>=g[0].length || g[r][c]==1 || g[r][c]==2){
            return;
        }
        g[r][c]=3;
        if(d=='l') fun(r-1,c,g,d);
        if(d=='r') fun(r+1,c,g,d);
        if(d=='u') fun(r,c-1,g,d);
        if(d=='d') fun(r,c+1,g,d);
    }

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] g=new int[m][n];
        for(int[] i: guards) g[i[0]][i[1]]=1;
        for(int[] i: walls) g[i[0]][i[1]]=2;

        for(int[] i: guards){
            fun(i[0]-1,i[1],g,'l');
            fun(i[0]+1,i[1],g,'r');
            fun(i[0],i[1]-1,g,'u');
            fun(i[0],i[1]+1,g,'d');
        }
        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(g[i][j]==0) count++;
            }
        }
        return count;
    }
}
