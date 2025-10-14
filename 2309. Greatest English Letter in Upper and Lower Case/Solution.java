class Solution {
    public String greatestLetter(String s) {
       boolean[] pt=new boolean[128];
       for(char ch: s.toCharArray()){
           pt[ch]=true;
       } 
       for(int i=90; i>64; i--){
         if(pt[i] && pt[i+32]) return String.valueOf((char)i);
       }
       return "";
    }
}
