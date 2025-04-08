class Solution {
    public String reverseVowels(String s) {
        char[] word= s.toCharArray();
        int lft=0;
        int rght=s.length()-1;
        while(lft<rght){
            while(lft<rght && isNotVowel(word[lft])){
                lft++;
            }
            while(lft<rght && isNotVowel(word[rght])){
                rght--;
            }
            char temp= word[lft];
            word[lft]= word[rght];
            word[rght]= temp;
            lft++;
            rght--;
        }
        return new String(word);
    }
    public boolean isNotVowel(char c){
        String vwl= "aeiouAEIOU";
        int i=vwl.indexOf(c);
        return i == -1;
    }
}
