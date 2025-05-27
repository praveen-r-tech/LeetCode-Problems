class Solution {
    public int mostWordsFound(String[] sentences) {
       int max= 0;
       for(String str: sentences){
        int wc= str.split(" ").length;
        if(max<wc) max= wc;
       } 
       return max;
    }
}
