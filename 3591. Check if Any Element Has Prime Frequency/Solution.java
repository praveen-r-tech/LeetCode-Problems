class Solution {

    boolean isPrime(int val){
      if(val<=1) return false;
      for(int i=2; i*i<=val; i++){
        if(val%i==0) return false;
      }
      return true;
    }

    public boolean checkPrimeFrequency(int[] nums) {
      int[] freq=new int[101];
      for(int idx: nums){
          freq[idx]++;
      }  
      for(int val: freq){
          if(isPrime(val)) return true;
      }
      return false;
    }
}
