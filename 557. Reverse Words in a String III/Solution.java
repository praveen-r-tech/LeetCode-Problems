class Solution {
    public String reverseWords(String s) {
       StringBuilder ans= new StringBuilder();
       String word[]= s.split(" ");
       for(String w: word){
          StringBuilder temp= new StringBuilder(w);
          ans.append(temp.reverse());
          ans.append(" ");
       }
       return ans.toString().trim();
    }
}
