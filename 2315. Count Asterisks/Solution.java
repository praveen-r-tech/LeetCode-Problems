class Solution {
    public int countAsterisks(String s) {
      int count= 0;
      boolean flag= true;
      for(char ch: s.toCharArray()){
        if(ch=='*' && flag){
            count++;
        }else if(ch=='|'){
            flag= !flag;
        }
      } 
      return count;
    }
}
