class Solution {
    public String finalString(String s) {
      StringBuilder res= new StringBuilder();
      for(char c: s.toCharArray()){
        if(c== 'i'){
            res.reverse();
            continue;
        }
        res.append(c);
      }
      return res.toString();
    }
}
