class Solution {
    public boolean checkZeroOnes(String s) {
       int ct1=0;
       int ct0=0;
       int max0=0;
       int max1=0;
       for(char c: s.toCharArray()){
           if(c=='0'){
              ct0++;
              if(ct0>max0) max0=ct0;
           }else{
              ct0=0;
           }
           if(c=='1'){
              ct1++;
              if(ct1>max1) max1=ct1;
           }else{
              ct1=0;
           }
       } 
       return max1>max0;
    }
}
