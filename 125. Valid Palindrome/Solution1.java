class Solution1 {
    public boolean isPalindrome(String s) {
       s=s.replaceAll("[^a-zA-Z0-9]",""); 
       int lft=0;
       int rht=s.length()-1;
       while(lft<rht){
          if(Character.toLowerCase(s.charAt(lft))!=Character.toLowerCase(s.charAt(rht)))
             return false;
          lft++;
          rht--;
       }
       return true;
    }
}
