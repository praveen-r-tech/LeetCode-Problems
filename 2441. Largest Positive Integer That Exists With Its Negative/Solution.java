class Solution {
    public int findMaxK(int[] nums) {
      int ans= -1;
      for(int v1: nums){
        for(int v2: nums){
            if(v1==-v2){
                ans=Math.max(ans, Math.abs(v1));
            }
        }
      }  
      return ans;
    }
}
