class Solution {
    public int lengthOfLongestSubstring(String s) {
      int lft=0;
      int max=0;
      HashSet<Character> set=new HashSet<>();
      for(int rht=0; rht<s.length(); rht++){
        while(set.contains(s.charAt(rht))){
            set.remove(s.charAt(lft));
            lft++;
        }
        set.add(s.charAt(rht));
        max= Math.max(max, rht-lft+1);
      }        
      return max;
    }
}
