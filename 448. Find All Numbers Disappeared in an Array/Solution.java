class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      List<Integer> ans= new ArrayList<>();
      HashSet<Integer> values= new HashSet<>();
      for(int num: nums){
        values.add(num);
      }
      int len= nums.length;
      for(int i=1; i<=len; i++){
        if(!values.contains(i)){
            ans.add(i);
        }
      }
      return ans;
    }
}
