class Solution {
    public int pivotInteger(int n) {
      int left= 1;
      int right= n;
      int lsum= left;
      int rsum= right;
      if(n == 1) return n;
      while(left<right){
        if(lsum<rsum){
           lsum+= ++left;
        } 
        else {
            rsum+= --right;
        }
        if(lsum==rsum && left+1==right-1) return left+1;
      }
      return -1;  
    }
}
