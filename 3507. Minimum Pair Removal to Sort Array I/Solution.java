class Solution {
    public boolean checkDivisibility(int n) {
       int tmp=n;
       int sum=0;
       int pdt=1;
       while(tmp>0){
         sum+=tmp%10;
         pdt*=tmp%10;
         tmp/=10;
       }
       if(n%(sum+pdt)==0) return true;
       return false; 
    }
}
