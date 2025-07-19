class Solution {
    public double minimumAverage(int[] nums) {
      List<Double> avg= new ArrayList<>();
      Arrays.sort(nums);
      for(int i=0; i<nums.length/2; i++){
        double val= (nums[i]+ nums[nums.length-1-i])/2.0;
        avg.add(val);
      }
      return Collections.min(avg);
    }
}
