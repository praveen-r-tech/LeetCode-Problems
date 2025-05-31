class Solution {
    public int getLucky(String s, int k) {
      StringBuilder ans= new StringBuilder();
      for(char c: s.toCharArray()){
        ans.append(c- 'a'+ 1);
      }
      s= ans.toString();
      for(int i=0; i<k; i++){
        int sum= 0;
        for(char c: s.toCharArray()){
         sum+= c- '0';
        }
        s= Integer.toString(sum);
      }
      return Integer.parseInt(s);
    }
}
