class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res= new StringBuilder();
        int pt1=0;
        int pt2=0;
        while(pt1< word1.length() || pt2< word2.length()){
            if(pt1< word1.length()){
                res.append(word1.charAt(pt1++));
            }
            if(pt2< word2.length()){
                res.append(word2.charAt(pt2++));
            }
        }
        return res.toString();
    }
}
