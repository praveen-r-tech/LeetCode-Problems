class Solution {
    public int vowelStrings(String[] words, int left, int right) {
       int ct=0; 
       for(int i=left; i<=right; i++){
        String str= words[i];
        if(isVowel(str.charAt(0)) && isVowel(str.charAt(str.length()-1))){
            ct++;
        }
       } 
       return ct;
    }
     public boolean isVowel(char c){
        String vwl= "aeiouAEIOU";
        int i= vwl.indexOf(c);
        return i != -1;
    }
}
