class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       int ans=0;
       for(String s: words){
           int count=0; 
           for(char c: s.toCharArray()){
               if(allowed.indexOf(c)>-1) count++;
           }
           if(s.length()==count) ans++;
       }
       return ans;
    }
}
