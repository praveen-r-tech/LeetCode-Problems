class Solution {
    public int numberOfSpecialChars(String word) {
       boolean[] freq=new boolean[128];
       for(char ch: word.toCharArray()){
           freq[ch]=true;
       } 
       int count=0;
       for(int i=97; i<128; i++){
         if(freq[i] && freq[i-32]) count++;
       }
       return count;
    }
}
