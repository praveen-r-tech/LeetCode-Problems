class Solution {
    boolean isVowel(char ch){
       String v="AEIOUaeiou";
       if(v.indexOf(ch)>-1) return true;
       else return false; 
    }

    public String sortVowels(String s) {
      StringBuilder sb=new StringBuilder();
      List<Character> ls=new ArrayList<>();
      for(int i=0; i<s.length(); i++){
        if(isVowel(s.charAt(i))){
           sb.append('-');
           ls.add(s.charAt(i));
        }else{
            sb.append(s.charAt(i));
        }
      } 
      Collections.sort(ls);
      int idx=0;
      for(int i=0; i<s.length(); i++){
        if(sb.charAt(i)=='-'){
            sb.setCharAt(i, ls.get(idx++));
        }
      }
      return sb.toString();
    }
}
