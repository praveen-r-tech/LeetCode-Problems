class Solution {

    boolean canType(String w,String b){
       for(int i=0; i<w.length(); i++){
           if(b.indexOf(w.charAt(i))>-1) return false;
       }
       return true;
    }
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] word=text.split(" ");
        int count=0;
        for(String w: word){
            if(canType(w,brokenLetters)) count++;
        }
        
        return count;
    }
}
