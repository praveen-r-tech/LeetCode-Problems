class Solution {
    public boolean areOccurrencesEqual(String s) {
       HashMap<Character Intege,r> hm= new HashMap<>();
       for(char ch: s.toCharArray()){
        hm.put(ch, hm.getOrDefault(ch, 0)+ 1);
       }

       int freq= -1;
       for(int val : hm.values()) {
          if(freq == -1) freq= val;
          else if(val != freq) return false;
        }
        return true;
    }
}
