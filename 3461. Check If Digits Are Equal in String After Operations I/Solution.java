class Solution {
    public boolean hasSameDigits(String s) {
       while(s.length()>2){
         StringBuilder sb=new StringBuilder();
         for(int i=0; i+1<s.length(); i++){
            int a=s.charAt(i);
            int b=s.charAt(i+1);
            sb.append((a+b)%10);
         }
         s=sb.toString();
       }
       return s.charAt(0)==s.charAt(1);
    }
}
