class Solution {
    public List<Integer> findMissingElements(int[] nums) {
      List<Integer> ans=new ArrayList<>();
      Set<Integer> set=new HashSet<>();
      int min=100;
      int max=0;
      for(int val: nums){
          set.add(val);
          if(val>max) max=val;
          if(val<min) min=val;
      }
      for(int i=min; i<max; i++){
          if(!set.contains(i)) ans.add(i);
      }       
      return ans;
    }
}
