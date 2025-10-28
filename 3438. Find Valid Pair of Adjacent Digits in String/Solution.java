class Solution {
    public String findValidPair(String s) {
        int[] freq=new int[10];
        for(char ch: s.toCharArray()){
            freq[ch-'0']++;
        }
        for(int i=1; i<s.length(); i++){
            if((s.charAt(i)!=s.charAt(i-1)) && 
              (freq[s.charAt(i)-'0']==s.charAt(i)-'0') &&
              (freq[s.charAt(i-1)-'0']==s.charAt(i-1)-'0')){
                    return s.substring(i-1,i+1);
                }
        }
        return "";
    }
}
