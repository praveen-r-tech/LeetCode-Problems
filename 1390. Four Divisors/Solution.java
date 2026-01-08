class Solution {
    public int sumFourDivisors(int[] nums) {
       int sum=0;
       for(int val: nums){
           int count=0;
           int tmp=0;
           for(int i=1; i*i<=val; i++){
               if(val%i==0){
                  tmp+=i;
                  count++;
                  if(i!=val/i){
                     tmp+=val/i;
                     count++;
                  }
               } 
               if(count>4) break;
           }
           if(count==4) sum+=tmp;
       } 
       return sum;
    }
}
