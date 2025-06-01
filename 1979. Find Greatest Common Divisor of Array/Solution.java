class Solution {
    public int findGCD(int[] nums) {
      int min= nums[0], max= nums[0];
      for(int val: nums){
        if(val<min) min=val;
        if(val>max) max=val;
      }
      return hcf(min, max);   
    }
    int hcf(int a, int b){
        return b==0? a:hcf(b, a%b);
    }
}
