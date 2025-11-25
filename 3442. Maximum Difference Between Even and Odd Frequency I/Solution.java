class Solution {
    public int maxDifference(String s) {
        int[] freq=new int[26];
        for(char ch: s.toCharArray()){
            freq[ch-'a']++;
        }
        int maxOdd=0;
        int minEven=Integer.MAX_VALUE;
        for(int i=0; i<26; i++){
            if(freq[i]>0){
                if(freq[i]%2==1 && freq[i]>maxOdd) maxOdd=freq[i];
                else if(freq[i]%2==0 && freq[i]<minEven) minEven=freq[i];
            }
        }
        return maxOdd-minEven;
    }
}
