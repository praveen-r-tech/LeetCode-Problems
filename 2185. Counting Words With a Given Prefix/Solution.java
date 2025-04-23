class Solution {
    public int prefixCount(String[] words, String pref) {
       int count=0;
        for(String s:words){
            if(s.length()>=pref.length() && s.startsWith(pref)){
                count++;
            }
        }
        return count; 
    }
}
