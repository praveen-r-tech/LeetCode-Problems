class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
       int count=0;
       for(int i=0; i<words.length-1; i++){
           StringBuilder sb=new StringBuilder(words[i]);
           String s=sb.reverse().toString();
           for(int j=i+1; j<words.length; j++){
               if(s.equals(words[j])) count++;
           }
       }
       return count;
    }
}
