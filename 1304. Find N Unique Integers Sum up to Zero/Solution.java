class Solution {
    public int[] sumZero(int n) {
      int ans[]= new int[n];
      int sum= 0;
      for(int i=1; i<n; i++){
        ans[i]= i;
        sum+=i;
      }  
      ans[0]= -sum;
      return ans;
    }
}
