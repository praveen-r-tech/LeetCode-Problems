class Solution {
    public int numOfStrings(String[] patterns, String word) {
      int ans= 0;
      for(String ptn: patterns){
        if(word.contains(ptn)) ans++;
      }
      return ans;
    }
}
