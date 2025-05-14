class Solution {
    public String makeGood(String s) {
       StringBuilder ans= new StringBuilder(s);
       int i=0;
       while(i<ans.length()-1){
         char curr= ans.charAt(i);
         char next= ans.charAt(i+1);
         if(Math.abs(curr-next) == 32){
           ans.deleteCharAt(i);
           ans.deleteCharAt(i);
           if(i>0)i--;
           else i=0;
         }else{
            i++;
         }
       }
      return ans.toString();
    }
}
