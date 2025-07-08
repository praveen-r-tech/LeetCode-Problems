class Solution {
    public int countPalindromicSubsequence(String s) {
      int lft[]= new int[128];
      int rgt[]= new int[128];
      for(char ch: s.toCharArray()){
        rgt[ch]++;
      } 
      lft[s.charAt(0)]++;
      rgt[s.charAt(0)]--;
      Set<String> unq= new HashSet<>();
      for(int i=1; i<s.length(); i++){
        char mid= s.charAt(i);
        rgt[mid]--;
        for(char ch='a'; ch<='z'; ch++){
            if(rgt[ch]*lft[ch]!= 0){
                StringBuilder sb= new StringBuilder();
                sb.append(ch).append(mid).append(ch);
                unq.add(sb.toString());
            }
        }
        lft[mid]++;
      }
      return unq.size();
    }
}
