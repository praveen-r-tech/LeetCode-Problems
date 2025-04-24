class Solution1 {
    public String reversePrefix(String word, char ch) {
       int ct= -1;
       for(int i= 0; i<word.length(); i++){
        if(word.charAt(i)== ch){
            ct=i;
            break;
        }
       }
       if(ct== -1) return word;
       StringBuilder res= new StringBuilder(word.substring(0,ct+1));
       res.reverse();
       res.append(word.substring(ct+1,word.length())); 
       return res.toString(); 
    }
}
