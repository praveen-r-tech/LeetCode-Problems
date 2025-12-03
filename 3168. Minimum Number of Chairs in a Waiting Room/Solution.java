class Solution {
    public int minimumChairs(String s) {
      int max=0;
      int val=0;
      for(char c: s.toCharArray()){
          if(c=='E') val++;
          else val--;
          if(val>max) max=val; 
      }  
      return max;
    }
}
