class Solution {
    public String sortSentence(String s) {
      String[] temp= s.split(" ");
      String[] ans= new String[temp.length];
      for(String str: temp){
        int idx= str.charAt(str.length()-1)-'0';
        ans[idx-1]= str.substring(0, str.length()-1); 
      }  
      return String.join(" ", ans);
    }
}
