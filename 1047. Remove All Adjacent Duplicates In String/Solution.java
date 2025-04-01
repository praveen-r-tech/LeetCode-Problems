class Solution {
    public String removeDuplicates(String s) {
        StringBuilder res= new StringBuilder();
        for(char c: s.toCharArray()){
            int ptr= res.length();
            if(ptr>0 && res.charAt(ptr-1)== c){
                res.deleteCharAt(ptr-1);
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
