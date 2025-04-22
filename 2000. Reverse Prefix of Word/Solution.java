class Solution {
    public String reversePrefix(String word, char ch) {
       Stack<Character> st= new Stack<>();
       StringBuilder res= new StringBuilder();
       int c=0;
       boolean found = false;
       for(char l: word.toCharArray()){
        c++;
        if(l== ch){
          st.push(ch);
          found= true;
          break;
        }
        st.push(l);
       } 
       if(!found) return word;
       while(!st.empty()){
        res.append(st.pop());
       }
       res.append(word.substring(c,word.length()));
       return res.toString(); 
    }
}
