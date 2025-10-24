class Solution {

    static boolean isNum(String w){
       for(char ch: w.toCharArray()){
           if(!Character.isDigit(ch)) return false;
       }
       return true;
    }

    public boolean areNumbersAscending(String s) {
       String[] word=s.split(" ");
       int prev=0;
       for(String w: word){
           if(isNum(w)){
              int val=Integer.parseInt(w);
              if(prev<val) prev=val;
              else return false;
           }
       }
       return true;
    }
}
