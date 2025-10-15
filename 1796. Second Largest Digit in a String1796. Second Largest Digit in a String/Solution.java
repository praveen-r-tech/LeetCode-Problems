class Solution {
    public int secondHighest(String s) {
       int max=-1;
       int max2=-1;
       for(char ch: s.toCharArray()){
           if(Character.isDigit(ch)){
              int val=ch-'0';
              if(val>max){
                max2=max;
                max=val;
              }else if(val<max && val>max2){
                max2=val;
              }
           }
       } 
       
       return max2;
    }
}
