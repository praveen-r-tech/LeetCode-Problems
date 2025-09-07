class Solution {
    public String longestCommonPrefix(String[] strs) {
       if(strs.length==0) return "";
       String p=strs[0];
       int plen=p.length();
       for(int i=1; i<strs.length; i++){
          while(plen>strs[i].length()|| !p.equals(strs[i].substring(0,plen))){
            plen--;
            if(plen==0){
                return "";
            }
            p=p.substring(0,plen);
          }
       }
       return p;
    }
}
