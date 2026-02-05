class Solution {
    public String sortString(String s) {
        int[] frq=new int[26];
        int max=0;
        for(char c: s.toCharArray()){
            int idx=c-'a';
            frq[idx]++;
            if(frq[idx]>max) max=frq[idx];
        }  
        StringBuilder sb=new StringBuilder();
        while(max-->0){
            for(int i=0; i<26; i++){
                if(frq[i]>0){
                   sb.append((char)(i+'a'));
                   frq[i]--;
                }
            }
            for(int i=25; i>=0; i--){
                if(frq[i]>0){
                    sb.append((char)(i+'a'));
                    frq[i]--;
                }
            }
        }
        return sb.toString();
    }
}
