class Solution {
    public boolean isPalindrome(String s) {
      StringBuilder sb=new StringBuilder();
      for(char c: s.toCharArray()){
        if(c>='a' && c<='z'){
          sb.append(c);
        }else if(c>='A' && c<='Z'){
          sb.append((char)(c+32));
        }else if(c>='0' && c<='9'){
          sb.append(c);
        }
      }  
      String s1=sb.toString();
      String s2=sb.reverse().toString();
      return s1.equals(s2); 
    }
}
