class Solution {
    public String clearDigits(String s) {
      int index= 0;
      StringBuilder ans= new StringBuilder(s);
      while(index<ans.length()){
        if(Character.isDigit(ans.charAt(index))){
            ans.deleteCharAt(index);
            ans.deleteCharAt(index-1);
            index--;
        }else{
            index++;
        }
      }
      return ans.toString(); 
    }
}
