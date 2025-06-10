class Solution {
    public boolean wordPattern(String pattern, String s) {
       String[] words= s.split(" ");
       if(words.length!= pattern.length()){
        return false;
       }
       HashMap<Character, String> cTw= new HashMap<>();
       HashMap<String, Character> wTc= new HashMap<>();

       for(int i=0; i<pattern.length(); i++){
        char c= pattern.charAt(i);
        String word= words[i];
        if(cTw.containsKey(c)){
            if(!cTw.get(c).equals(word)){
                return false;
            }
        }else{
            cTw.put(c, word);
        }
        if(wTc.containsKey(word)){
            if(wTc.get(word)!= c){
                return false;
            }
        }else{
            wTc.put(word, c);
        }
       }
       return true;
    }
}
