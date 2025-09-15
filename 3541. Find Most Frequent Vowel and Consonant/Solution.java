class Solution {
    public int maxFreqSum(String s) {
        char[] freq=new char[26];
        for(int i=0; i<s.length(); i++){
            int idx=s.charAt(i)-'a';
            freq[idx]++;
        }
        int vowVal=0;
        int conVal=0;
        for(int i=0; i<26; i++){
            if(i==0 || i==4 || i==8 || i==14 || i==20){
                if(freq[i]>vowVal){
                    vowVal=freq[i];
                }
            }else{
                if(freq[i]>conVal){
                    conVal=freq[i];
                }
            }
        }
        return vowVal+conVal;
    }
}
