class Solution {
    public String[] divideString(String s, int k, char fill) {
      int n= s.length();
      int nfill= (n%k==0)? 0: (k-n%k);
      StringBuilder res= new StringBuilder(s);
      while(nfill>0){
        res.append(fill);
        nfill--;
      }
      String[] ans= new String[res.length()/k];
      for(int i=0; i<ans.length; i++){
        ans[i]= res.substring(i*k, i*k+k);
      }
      return ans;
    }
}
