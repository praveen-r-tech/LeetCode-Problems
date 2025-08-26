class Solution {
    public int uniqueMorseRepresentations(String[] words) {
      Set<String> ls=new HashSet<>();
      String[] ref={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
      for(String word: words){
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<word.length(); i++){
            int idx=word.charAt(i)-'a';
            sb.append(ref[idx]);
        }
        ls.add(sb.toString());
      }
      return ls.size();
    }
}
