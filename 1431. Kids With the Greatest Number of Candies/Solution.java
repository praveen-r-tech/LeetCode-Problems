class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      List<Boolean> ans= new ArrayList<>();
      int max= 0;
      for(int val: candies){
        if(val>max) max=val;
      }   
      for(int i=0; i<candies.length; i++){
        ans.add(candies[i]+extraCandies>=max);
      }
      return ans;
    }
}
