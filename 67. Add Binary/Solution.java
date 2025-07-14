class Solution {
    public String addBinary(String a, String b) {
      StringBuilder ans= new StringBuilder();
      int i= a.length()-1, j= b.length()-1;
      int carry= 0;
      while(i>=0 || j>=0 || carry>0){
        int n1= (i>=0) ? a.charAt(i) - '0' : 0;
        int n2= (j>=0) ? b.charAt(j) - '0' : 0;
        int sum= n1+ n2+ carry;
        int digit= sum%2;
        carry= sum/2;
        ans.append(digit);
        i--;
        j--;
      }  
      return ans.reverse().toString();
    }
}
