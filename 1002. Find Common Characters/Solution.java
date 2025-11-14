class Solution {
    public List<String> commonChars(String[] words) {
        int[] freq=new int[26];
        for(char ch: words[0].toCharArray()){
            freq[ch-'a']++;
        }
        int[] curFreq=new int[26];
        for(int i=1; i<words.length; i++){
            Arrays.fill(curFreq,0);
            for(char ch: words[i].toCharArray()){
                curFreq[ch-'a']++;
            }
            for(int idx=0; idx<26; idx++){
                freq[idx]=Math.min(freq[idx], curFreq[idx]);
            }
        }
        List<String> ls=new ArrayList<>();
        for(int i=0; i<26; i++){
            for(int t=0; t<freq[i]; t++){
                ls.add(((char)(i+'a'))+"");
            }
        }
        return ls;
    }
}
