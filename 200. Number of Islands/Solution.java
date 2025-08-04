class Solution {
    void change(char a[][],int i,int j){
      if(i<0||j<0||i==a.length||j==a[0].length||a[i][j]!='1'){
         return;
      }
      a[i][j]='9';
      change(a,i-1,j);
      change(a,i+1,j);
      change(a,i,j-1);
      change(a,i,j+1);
    }
    public int numIslands(char[][] a) {
       int count= 0;
       for(int i=0; i<a.length; i++){
        for(int j=0; j<a[0].length; j++){
           if(a[i][j]=='1'){
            count++;
            change(a,i,j);
           }
        }
       }
       return count; 
    }
}
