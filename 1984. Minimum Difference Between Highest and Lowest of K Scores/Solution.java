class Solution {
    public int minimumDifference(int[] nums, int k) {
      Arrays.sort(nums);
      int min=Integer.MAX_VALUE;
      for(int i=0; i+k-1<nums.length; i++){
          int val=nums[i+k-1]-nums[i];
          if(val<min) min=val;
      }
      return min;
    }
}
