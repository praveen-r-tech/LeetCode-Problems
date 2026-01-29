class Solution {
    
    boolean fun(char c){
        String vow="aeiou";
        if(vow.indexOf(c)>-1) return true;
        return false;
    }
    
    public int vowelConsonantScore(String s) {
        s=s.replaceAll("[^a-z]","");
        int c=0;
        int v=0;
        for(char ch: s.toCharArray()){
            if(fun(ch)) v++;
            else c++;
        }
        if(c>0) return v/c;
        return 0;
    }
}
