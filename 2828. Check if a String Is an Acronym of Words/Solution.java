class Solution {
    public boolean isAcronym(List<String> words, String s) {
       StringBuilder res= new StringBuilder();
       for(String str: words){
        res.append(str.charAt(0));
       }  
       return s.equals(res.toString());
    }
}
