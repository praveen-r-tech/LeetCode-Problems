class Solution1 {
    public boolean isAnagram(String s, String t) {
      int[] frq1=new int[26];
      int[] frq2=new int[26];
      for(char c: s.toCharArray()){
          frq1[c-'a']++;
      }
      for(char c: t.toCharArray()){
          frq2[c-'a']++;
      }
      for(int i=0; i<26; i++){
          if(frq1[i]!=frq2[i]) return false;
      }
      return true;
    }
}
