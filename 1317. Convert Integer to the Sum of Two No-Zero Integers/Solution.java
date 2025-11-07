class Solution {
    public int[] getNoZeroIntegers(int n) {
      for(int i=0; i<n; i++){
          if(String.valueOf(i).indexOf('0')==-1 && 
             String.valueOf(n-i).indexOf('0')==-1){
               return new int[]{i,n-i};
            }
      }
      return new int[2];  
    }
}
