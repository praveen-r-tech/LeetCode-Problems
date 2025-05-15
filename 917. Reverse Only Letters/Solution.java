class Solution {
    public String reverseOnlyLetters(String s) {
      int lft= 0;
      int rht= s.length()-1;
      char res[]= new char[rht+1];
      while(lft<=rht){
        if(Character.isAlphabetic(s.charAt(lft)) && Character.isAlphabetic(s.charAt(rht))){
            res[lft]= s.charAt(rht);
            res[rht]= s.charAt(lft);
            lft++;
            rht--;
        }
        else if(!Character.isAlphabetic(s.charAt(rht))){
            res[rht]= s.charAt(rht);
            rht--;
        }else if(!Character.isAlphabetic(s.charAt(lft))){
            res[lft]= s.charAt(lft);
            lft++;
        }
      }
      return new String (res); 
    }
}
