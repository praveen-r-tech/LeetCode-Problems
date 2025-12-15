class Solution {
    public int alternateDigitSum(int n) {
       int sum=0;
       String s=Integer.toString(n);
       for(int i=0; i<s.length(); i++){
           int val=s.charAt(i)-'0';
           if(i%2==0) sum+=val;
           else sum-=val;
       } 
       return sum;
    }
}
