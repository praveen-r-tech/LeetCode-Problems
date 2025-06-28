class Solution {
    public int minElement(int[] nums) {
      int index= 0;
      for(int num: nums){
        int sum= 0;
        while(num>0){
            sum+= num%10;
            num/= 10;
        }
        nums[index++]= sum;
      } 
      Arrays.sort(nums);
      return nums[0];
    }
}
