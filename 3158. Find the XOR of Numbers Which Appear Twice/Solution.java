class Solution {
    public int duplicateNumbersXOR(int[] nums) {
      int[] freq=new int[51];
      for(int idx: nums){
          freq[idx]++;
      } 
      int ans=0;
      for(int i=1; i<51; i++){
        if(freq[i]==2) ans|=i;
      }
      return ans; 
    }
}
