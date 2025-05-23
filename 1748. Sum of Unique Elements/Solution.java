class Solution {
    public int sumOfUnique(int[] nums) {
      int ans= 0;
      HashMap<Integer, Integer> hm= new HashMap<>();
      for(int val: nums){
        hm.put(val, hm.getOrDefault(val, 0)+1);
        if(hm.get(val) == 1){
          ans+=val;
        }else if(hm.get(val) == 2){
          ans-=val;
        } 
      } 
      return ans;  
    }
}
