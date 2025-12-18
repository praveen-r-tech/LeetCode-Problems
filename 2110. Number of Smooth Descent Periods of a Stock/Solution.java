class Solution {
    public long getDescentPeriods(int[] prices) {
       long ans=1;
       int p=1;
       for(int i=1; i<prices.length; i++){
           if(prices[i]==prices[i-1]-1) p++;
           else p=1;
           ans+=p;
       }  
       return ans;
    }
}
