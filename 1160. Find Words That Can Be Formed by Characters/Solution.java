class Solution {
    public int countCharacters(String[] words, String chars) {
       char[] lt=new char[26];
       for(int i=0; i<chars.length(); i++){
         lt[chars.charAt(i)-'a']++;
       }
       int count=0;
       for(String w: words){
        char[] check=lt.clone();
        boolean flag=true;
        for(int i=0; i<w.length(); i++){
            int pos=w.charAt(i)-'a';
            if(check[pos]>0){
               check[pos]--;
            }else{
                flag=false;
                break;
            }
        }
        if(flag) count+=w.length();
       }
       return count;
    }
}
