class Solution {
    
    boolean start(String s){
      char c=Character.toLowerCase(s.charAt(0));
      return !(c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }

    public String toGoatLatin(String sentence) {
       String[] word=sentence.split(" ");
       StringBuilder sb=new StringBuilder();
       for(int i=0; i<word.length; i++){
           String w=word[i];
           if(start(w)){
              sb.append(w.substring(1)+w.charAt(0));
           }else sb.append(w);
           sb.append("ma");
           for(int j=0; j<=i; j++){
              sb.append("a");
           }
           sb.append(" ");
       } 
       return sb.toString().trim();
    }
}
